import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Rico on 09.05.2017.
 */
public class ProgramTest
{
    String test = "Rental Record for joe\n" +
            "\tTitle\t\tDays\tAmount\n" +
            "\tmovie1\t\t10\t30.0\n" +
            "\tmovie2\t\t5\t4.5\n" +
            "Amount owed is 34.5\n" +
            "You earned 3 frequent renter points";

    Movie m1 = new Movie("movie1", 1);
    Movie m2 = new Movie("movie2", 2);
    Rental r1 = new Rental(m1, 10);
    Rental r2 = new Rental(m2, 5);
    Customer c1 = new Customer("joe");

    @Test
    public void testStatement(){
        c1.addRental(r1);
        c1.addRental(r2);
        assertEquals(test, c1.statement());
    }

}