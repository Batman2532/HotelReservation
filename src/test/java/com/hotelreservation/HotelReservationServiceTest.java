package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelReservationServiceTest {
    HotelReservationService hotelReservationService = new HotelReservationService();
    Hotels Lakewood = new Hotels("Lakewood",110,90);
    Hotels Bridgewood = new Hotels("Bridgewood",150,50);
    Hotels RidgeWood = new Hotels("Ridgewood",220,150);

    @Test
    public void givenDate_shouldReturnLakeWood() {
        hotelReservationService.addHotelDetails(Lakewood);
        hotelReservationService.addHotelDetails(Bridgewood);
        hotelReservationService.addHotelDetails(RidgeWood);
        List hotelList = hotelReservationService.getHotels();
        Assertions.assertTrue(hotelList.contains(Lakewood));
    }

    @Test
    public void given3Hotels_shouldBeAbleToReturnCheapestHotel() {
        hotelReservationService.addHotelDetails(Lakewood);
        hotelReservationService.addHotelDetails(Bridgewood);
        hotelReservationService.addHotelDetails(RidgeWood);
        int cheapestHotel = hotelReservationService.findCheapestHotel("18May2021","21May2021");
        Assertions.assertEquals(330,cheapestHotel);
    }

    @Test
    void givenDateRangeWeShouldGetPriceAccordingToWeekDayAndWeekEnds() {
        hotelReservationService.addHotelDetails(Lakewood);
        hotelReservationService.addHotelDetails(Bridgewood);
        hotelReservationService.addHotelDetails(RidgeWood);
        int cheapestHotel = hotelReservationService.findCheapestHotel("20May2021","23May2021");
        Assertions.assertEquals(250, cheapestHotel);
    }
}
