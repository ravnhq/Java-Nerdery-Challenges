import org.example.Palindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindromeString() {
        assertTrue(palindrome.checkPalindromeString("ABA"));
        assertTrue(palindrome.checkPalindromeString("ABA"));
    }

    @Test
    public void isPalindromeNumber() {
        assertTrue(palindrome.checkPalindromeString("111"));
        assertTrue(palindrome.checkPalindromeString("222"));
        assertTrue(palindrome.checkPalindromeString("1010"));
        assertTrue(palindrome.checkPalindromeString("233"));
    }
}
