package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    public void givenDate_shouldReturnLakeWood()throws Exception {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotelDetails();
        String cheapestHotel = hotelReservation.calculateCheapestHotelAndRate();
        Assertions.assertEquals("Lakewood", cheapestHotel);
    }
}
