import org.example.Palindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindromeString() {
        assertTrue(palindrome.checkPalindromeString("ABA"));
        assertTrue(palindrome.checkPalindromeString("level"));
        assertTrue(palindrome.checkPalindromeString("madam"));
        assertTrue(palindrome.checkPalindromeString("radar"));
    }

    @Test
    public void isPalindromeNumber() {
        assertAll(()-> assertTrue(palindrome.checkPalindromeNumber(11)),
                () -> assertTrue(palindrome.checkPalindromeNumber(222)),
                () -> assertTrue(palindrome.checkPalindromeNumber(505)),
                () -> assertFalse(palindrome.checkPalindromeNumber(233)));
    }
}
