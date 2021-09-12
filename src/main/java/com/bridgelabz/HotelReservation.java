package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    public List<HotelInfo> hotelsList = new ArrayList<>();
    public boolean AddHotelToList(String hotelName, int regCustomerRate){
        HotelInfo hotels = new HotelInfo(hotelName, regCustomerRate);
        return hotelsList.add(hotels);
    }
}
