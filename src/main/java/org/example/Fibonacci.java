/* (C)2024 */
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public Integer fibonacci(int n) {
        // Base case: if n is 0 or 1, return n
        if (n <= 1) {
            return n;
        }

        // Recursive case: sum of the two preceding Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public List<Integer> finonacciList(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(fibonacci(i));
        }
        return list;
    }
}
