package com.vaishnavi.practice.spring;

import com.vaishnavi.practice.spring.service.SolarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        SolarService service = context.getBean("solarService", SolarService.class);
        service.displayInfo();
    }
}
