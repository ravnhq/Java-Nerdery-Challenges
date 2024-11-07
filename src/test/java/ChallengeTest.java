/* (C)2024 */
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    Challenges challenges;

    @BeforeEach
    void setUp() {
        challenges = new Challenges();
    }

    @Test
    public void readableTime() {
        assertEquals("00:07:38", challenges.readableTime(458));
        assertEquals("01:01:30", challenges.readableTime(3690));
        assertEquals("02:01:33", challenges.readableTime(7293));
        assertEquals("09:00:20", challenges.readableTime(32420));
    }

    @Test
    public void circularArray() {
        assertArrayEquals(
                new String[] {"Island", "Japan", "Israel", "Germany", "Norway"},
                challenges.circularArray(2));
        assertArrayEquals(
                new String[] {"Japan", "Israel", "Germany", "Norway", "Island"},
                challenges.circularArray(3));
        assertArrayEquals(
                new String[] {"Germany", "Norway", "Island", "Japan", "Israel"},
                challenges.circularArray(5));
        assertArrayEquals(
                new String[] {"Israel", "Germany", "Norway", "Island", "Japan"},
                challenges.circularArray(9));
    }

    @Test
    public void ownPower() {
        assertEquals("317", challenges.ownPower(10, 3));
        assertEquals("7190184", challenges.ownPower(12, 7));
        assertEquals("075684339445", challenges.ownPower(21, 12));
    }

    @Test
    public void digitSum() {
        assertEquals(27, challenges.digitSum(10));
        assertEquals(189, challenges.digitSum(189));
        assertEquals(423, challenges.digitSum(423));
        assertEquals(549, challenges.digitSum(549));
    }
}
