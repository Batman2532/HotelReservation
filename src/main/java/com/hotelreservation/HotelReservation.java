package com.hotelreservation;

import java.util.ArrayList;
import java.util.Comparator;

public class HotelReservation {
    ArrayList<Hotel> hotelList = new ArrayList<>();

    public void addHotelDetails() {
        hotelList.add(new Hotel("Lakewood", 110));
        hotelList.add(new Hotel("Bridgewood", 150));
        hotelList.add(new Hotel("Ridgewood", 220));
    }

    // Calculated rate based on period of stay at hotel
    public String calculateCheapestHotelAndRate() throws Exception {

        for (int hotel = 0; hotel < hotelList.size(); hotel++) {
            int totalRate = hotelList.get(hotel).getRegularRate() ;
            hotelList.get(hotel).setRegularRate(totalRate);
        }
        int regularHotelRate = hotelList.stream().min(Comparator.comparing(Hotel::getRegularRate)).get().getRegularRate();
        String hotelName = hotelList.stream().min(Comparator.comparing(Hotel::getRegularRate)).get().getHotelName();

        System.out.println("The Cheapest Hotel is "+hotelName+" with cost for respective date as "+regularHotelRate+"$");
        return hotelName;
    }

}
