package com.hotelreservation;

public class Hotels {
    // Parameters
    private String hotelName;
    private int regularRate;

    //Parameterized Constructor
    public Hotels(String hotelName, int regularRate) {
        this.hotelName = hotelName;
        this.regularRate = regularRate;
    }

    // Getter And Setter Methods
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRegularRate() {
        return regularRate;
    }

    public void setRegularRate(int regularRate) {
        this.regularRate = regularRate;
    }
}
