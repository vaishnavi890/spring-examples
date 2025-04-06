package com.vaishnavi.practice.spring;

import com.vaishnavi.practice.spring.model.Address;
import com.vaishnavi.practice.spring.model.Booking;
import com.vaishnavi.practice.spring.service.BookingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
        public static ApplicationContext context;
        public static void main( String[] args ) {
//        BookingService bookingService = new BookingService();
//        Booking booking = Booking.builder()
//                .id(1)
//                .price(200.00)
//                .address(
//                Address.builder()
//                        .addressLine1("flat no -1, abc apt")
//                        .addressLine2("hadapsar").city("pune").build()
//                ).build();
//
//        bookingService.setBooking(booking);
//
        context = new ClassPathXmlApplicationContext("spring.xml");
        BookingService bookingService = context.getBean("bookingService", BookingService.class);

        bookingService.printBooking();
    }
}

