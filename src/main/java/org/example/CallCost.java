package org.example;

import org.example.mocks.CallCostObject;
import org.example.mocks.CallSummary;
import org.example.mocks.TotalSummary;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CallCost {

    /**
     * Design a solution to calculate what to pay for a set of phone calls. The function must receive an
     * array of objects that will contain the identifier, type and duration attributes. For the type attribute,
     * the only valid values are: National, International and Local
     *
     * The criteria for calculating the cost of each call is as follows:
     *
     * International: first 3 minutes $ 7.56 -> $ 3.03 for each additional minute
     * National: first 3 minutes $ 1.20 -> $ 0.48 per additional minute
     * Local: $ 0.2 per minute.
     *
     * The function must return the total calls, the details of each call (the detail received + the cost of the call)
     * and the total to pay taking into account all calls
     *
     * @param {Call[]} calls - Call's information to be processed
     *
     * @returns {CallsResponse}  - Processed information
     */
    public TotalSummary calculateCost(List<CallCostObject> costObjectList) {

        int totalCalls = costObjectList.stream().filter(obj -> Objects.equals(obj.getType(), "National") || Objects.equals(obj.getType(), "International") || Objects.equals(obj.getType(), "Local")).toList().size();

        List<CallCostObject> validCalss = costObjectList.stream().filter(obj -> Objects.equals(obj.getType(), "National") || Objects.equals(obj.getType(), "International") || Objects.equals(obj.getType(), "Local")).toList();

        List<CallSummary> summaryList = validCalss.stream().map(call -> new CallSummary(call,calculateCallCost(call))).toList();

        Double totalCost = summaryList.stream().mapToDouble(CallSummary::getTotalCost).sum();

        return new TotalSummary(summaryList,totalCalls,totalCost);

    }
    Double calculateCallCost(CallCostObject call){
        switch (call.getType()) {
            case "International" -> {
                if (call.getDuration() - 3 <= 0) {
                    return call.getDuration() * 7.56;
                } else {
                    return 3 * 7.56 + ((call.getDuration() - 3) * 3.03);
                }
            }
            case "National" -> {
                if (call.getDuration() - 3 <= 0) {
                    return call.getDuration() * 1.2;
                } else {
                    return 3 * 1.2 + ((call.getDuration() - 3) * 0.48);
                }
            }
            case "Local" -> {
                return call.getDuration() * 0.2;
            }
        }
        return 0.0;
    }
}


