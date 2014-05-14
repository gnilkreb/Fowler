/**
 * Created with IntelliJ IDEA.
 * User: Berkling
 * Date: 14.05.14
 * Time: 12:49
 * To change this template use File | Settings | File Templates.
 */
public class NewReleasePrice implements Price {
    public int getPriceCode(){
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented){
        return (daysRented * 3 );
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 2;
    }

}

