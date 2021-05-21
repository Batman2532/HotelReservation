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
}
