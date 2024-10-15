import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JunitTest {

    @DisplayName("Assertion Success")
    @Test
    void assertSingleFailTest() {
        assertTrue(true);
    }
}
