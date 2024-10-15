import org.example.CallCost;
import org.example.mocks.CallCostMock;
import org.example.mocks.TotalSummary;
import org.hamcrest.core.Every;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

public class CallCostTest {
    CallCost callCost;
    CallCostMock callCostMock;

    @BeforeEach
    void setUp() {
        callCost = new CallCost();
        callCostMock = new CallCostMock();
    }
    @Test
    public void callCost() {
        assertEquals(5,callCost.calculateCost(callCostMock.calls).getTotalCalls());
        assertEquals(65.74,callCost.calculateCost(callCostMock.calls).getTotalCost());
        assertThat(callCost.calculateCost(callCostMock.calls),hasProperty("totalCost"));
        assertThat(callCost.calculateCost(callCostMock.calls).getCalls(),everyItem(hasProperty("totalCost")));


    }
}
