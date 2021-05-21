package com.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    List<Hotels> hotelList = new ArrayList<>();

    public void addHotelDetails(Hotels hotel) {
        hotelList.add(hotel);
    }

    public List<Hotels> getHotels() {
        return hotelList;
    }
}
