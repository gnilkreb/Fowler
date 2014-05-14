public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle (){
        return title;
    }

    public double getCharge(int days) {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if ( days > 2)
                    result += (days - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += days * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (days > 3)
                    result += (days - 3) * 1.5;
                break;
        }
        return result;
    }
}