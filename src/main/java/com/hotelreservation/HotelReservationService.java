package com.hotelreservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class HotelReservationService {
    List<Hotels> hotelList = new ArrayList<>();
    Map<String, Integer> costOfHotels = new HashMap<>();
    Map<String, String> monthsInYear = new HashMap<>();

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
        int numberOfWeekEnds = noOfWeekDaysAndWeekEnds(dateCheckIn, checkInDay, checkOutDay);
        numberOfDays = numberOfDays - numberOfWeekEnds;
        int finalNumberOfDays = numberOfDays;
        costOfHotels = hotelList.stream().collect(Collectors.toMap(Hotels::getHotelName, e -> e.getWeekdaysRates() * finalNumberOfDays + e.getWeekendRates() * numberOfWeekEnds));
        return Collections.min(costOfHotels.values());
    }
    public int noOfWeekDaysAndWeekEnds(String dateCheckIn, int checkIn, int checkOut) {
        int weekEndCount = 0;
        String month = dateCheckIn.substring(2, 5);
        int monthOfGivenDate = monthToNumber(month);
        String year = dateCheckIn.substring(5, 9);
        int yearOfGivenDate = Integer.parseInt(year);
        for (int i = checkIn; i <= checkOut; i++) {
            LocalDate localDate = LocalDate.of(yearOfGivenDate, monthOfGivenDate, i);
            DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
            if (dayOfWeek.name().equals("SATURDAY") || dayOfWeek.name().equals("SUNDAY")) {
                weekEndCount++;
            }
        }
        return weekEndCount;
    }

    public int monthToNumber(String month) {
        int monthToNumber = 0 ;
        if (month.equals("Jan"))
            monthToNumber = 1;
        if (month.equals("Feb"))
            monthToNumber = 2;
        if (month.equals("Mar"))
            monthToNumber = 3;
        if (month.equals("Apr"))
            monthToNumber = 4;
        if (month.equals("May"))
            monthToNumber = 5;
        if (month.equals("Jun"))
            monthToNumber = 6;
        if (month.equals("Jul"))
            monthToNumber = 7;
        if (month.equals("Aug"))
            monthToNumber = 8;
        if (month.equals("Sep"))
            monthToNumber = 9;
        if (month.equals("Oct"))
            monthToNumber = 10;
        if (month.equals("Nov"))
            monthToNumber = 11;
        if (month.equals("Dec"))
            monthToNumber = 12;

        return monthToNumber;
    }

    public List<Hotels> getHotels() {
        return hotelList;
    }

}
