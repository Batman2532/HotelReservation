package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelReservationServiceTest {

    @Test
    public void givenDate_shouldReturnLakeWood() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotels Lakewood = new Hotels("Lakewood",110,90);
        Hotels Bridgewood = new Hotels("Bridgewood",150,50);
        Hotels RidgeWood = new Hotels("Ridgewood",220,150);
        hotelReservationService.addHotelDetails(Lakewood);
        hotelReservationService.addHotelDetails(Bridgewood);
        hotelReservationService.addHotelDetails(RidgeWood);
        List hotelList = hotelReservationService.getHotels();
        Assertions.assertTrue(hotelList.contains(Lakewood));
    }

    @Test
    public void given3Hotels_shouldBeAbleToReturnCheapestHotel() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotels Lakewood = new Hotels("Lakewood",110,90);
        Hotels Bridgewood = new Hotels("Bridgewood",150,50);
        Hotels RidgeWood = new Hotels("Ridgewood",220,150);
        hotelReservationService.addHotelDetails(Lakewood);
        hotelReservationService.addHotelDetails(Bridgewood);
        hotelReservationService.addHotelDetails(RidgeWood);
        int cheapestHotel = hotelReservationService.findCheapestHotel("20May2021","23May2021");
        Assertions.assertEquals(30,cheapestHotel);
    }
}
