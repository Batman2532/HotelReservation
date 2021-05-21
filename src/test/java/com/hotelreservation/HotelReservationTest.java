package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelReservationTest {

    @Test
    public void givenDate_shouldReturnLakeWood() {
        HotelReservation hotelReservation = new HotelReservation();
        Hotels Lakewood = new Hotels("Lakewood",110);
        Hotels Bridgewood = new Hotels("Bridgewood",160);
        Hotels RidgeWood = new Hotels("Ridgewood",220);
        hotelReservation.addHotelDetails(Lakewood);
        hotelReservation.addHotelDetails(Bridgewood);
        hotelReservation.addHotelDetails(RidgeWood);
        List hotelList = hotelReservation.getHotels();
        Assertions.assertTrue(hotelList.contains(Lakewood));
    }

    @Test
    public void given3Hotels_shouldBeAbleToReturnCheapestHotel() {
        HotelReservation hotelReservationService = new HotelReservation();
        Hotels Lakewood = new Hotels("Lakewood",160);
        Hotels Bridgewood = new Hotels("Bridgewood",110);
        Hotels RidgeWood = new Hotels("Ridgewood",220);
        hotelReservationService.addHotelDetails(Lakewood);
        hotelReservationService.addHotelDetails(Bridgewood);
        hotelReservationService.addHotelDetails(RidgeWood);
        Assertions.assertEquals(330,hotelReservationService.findCheapestHotel("20May2021","23May2021"));
    }
}
