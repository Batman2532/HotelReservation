package com.hotelreservation;

public class Hotels {
    // Parameters
    private String hotelName;
    private int weekdaysRates;
    private int weekendRates;
    private int rating;
    //Parameterized Constructor
    public Hotels(String hotelName, int weekdaysRates, int weekendRates, int rating){
        this.hotelName = hotelName;
        this.weekdaysRates = weekdaysRates;
        this.weekendRates = weekendRates;
        this.rating = rating;
}
    // Getter And Setter Methods
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdaysRates() {
        return weekdaysRates;
    }

    public void setWeekdaysRates(int weekdaysRates) {
        this.weekdaysRates = weekdaysRates;
    }

    public int getWeekendRates() {
        return weekendRates;
    }

    public void setWeekendRates(int weekendRates) {
        this.weekendRates = weekendRates;
    }
}
