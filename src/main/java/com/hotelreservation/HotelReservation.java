package com.hotelreservation;

import java.util.*;
import java.util.stream.Collectors;

public class HotelReservation {
    List<Hotels> hotelList = new ArrayList<>();
    Map<String, Integer> costOfHotels = new HashMap<>();

    //Added hotel
    public void addHotelDetails(Hotels hotel) {
        hotelList.add(hotel);
    }

    //calculate cheapest hotel
    public int findCheapestHotel(String dateCheckIn, String dateCheckOut) {
        String dayStart = dateCheckIn.substring(0, 2);
        int checkInDay = Integer.parseInt(dayStart);
        String dayEnd = dateCheckOut.substring(0, 2);
        int checkOutDay = Integer.parseInt(dayEnd);
        int numberOfDays = checkOutDay - checkInDay;
        costOfHotels = hotelList.stream().collect(Collectors.toMap(e -> e.getHotelName(), e -> e.getRate() * numberOfDays));
        String hotel = Collections.min(costOfHotels.keySet());
        int cost = costOfHotels.get(hotel);
        System.out.println("Cheapest Hotel is " + hotel + " :" + cost);
        return cost;
    }

    public List<Hotels> getHotels() {
        return hotelList;
    }
}
