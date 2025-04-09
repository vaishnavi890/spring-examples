package com.vaishnavi.practice.spring;

import com.vaishnavi.practice.spring.service.ATMService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ATMService atmService = context.getBean("atmService", ATMService.class);

        atmService.showBalance();
        atmService.deposit(1000.00);
        atmService.withdraw(2000.00);
        atmService.withdraw(10000.00); // Should show insufficient
    }
}

