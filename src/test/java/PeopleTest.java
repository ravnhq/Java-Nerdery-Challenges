import org.example.People;
import org.example.mocks.PeopleMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleTest {
    People people;
    PeopleMock peopleMock;

    @BeforeEach
    void setUp() {
        people = new People();
        peopleMock = new PeopleMock();
    }

    @Test
    public void peopleMeanHeightTest() {
        System.out.println(people.calculateMeanHeight());
        assertEquals(people.calculateMeanHeight(),174);
    }

    @Test
    public void peopleMeanAgeTest() {
        assertEquals(people.calculateMeanAge(),49);
    }

    @Test
    public void peopleYoungestPersonTest() {
        assertEquals(people.youngestPerson(),peopleMock.getPeopleList().get(2).getName());
    }

    @Test
    public void peopleTallestPersonTest() {
        assertEquals(people.tallestPerson(),peopleMock.getPeopleList().get(1).getName());
    }
}
