import org.example.Fibonacci;
import org.example.mocks.FibonacciMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciTest {
    Fibonacci fibonacci;
    FibonacciMock fibonacciMock;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
        fibonacciMock = new FibonacciMock();
    }

    @Test
    void testFibonacci() {
        List<Integer> integers = fibonacciMock.getFIBONACCI_LIST();
        assertEquals(integers.subList(0,10), fibonacci.finonacciList(10));
    }
}
