/**
 * Created with IntelliJ IDEA.
 * User: Berkling
 * Date: 14.05.14
 * Time: 12:48
 * To change this template use File | Settings | File Templates.
 */
public interface Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
    abstract int getFrequentRenterPoints(int daysRented);
}
