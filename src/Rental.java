class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double getCharge() {
        double price = 0;
        switch (this.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                price += 2;
                if (this.getDaysRented() > 2)
                    price += (this.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                price += this.getDaysRented() * 3;
                break;
            case Movie.CHILDREN:
                price += 1.5;
                if (this.getDaysRented() > 3)
                    price += (this.getDaysRented() - 3) * 1.5;
                break;
        }
        return price;
    }
}