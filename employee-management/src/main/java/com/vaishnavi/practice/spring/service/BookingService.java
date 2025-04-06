package com.vaishnavi.practice.spring.service;

import com.vaishnavi.practice.spring.App;
import com.vaishnavi.practice.spring.model.Booking;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookingService {
    private Booking booking;

    public void printBooking() {
        System.out.println("Booking Details are: " + booking);
    }
}
