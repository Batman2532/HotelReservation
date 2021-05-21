package com.hotelreservation;

public class Hotels {
    // Parameters
    private String hotelName;
    private int rate;

    //Parameterized Constructor
    public Hotels(String hotelName, int rate) {
        this.hotelName = hotelName;
        this.rate = rate;
    }

    // Getter And Setter Methods
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int regularRate) {
        this.rate = rate;
    }
}
