package com.vaishnavi.practice.spring;

import com.vaishnavi.practice.spring.model.Address;
import com.vaishnavi.practice.spring.model.City;
import com.vaishnavi.practice.spring.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //        HelloService helloService = new HelloService();
//        City city = new City();
//        city.setName("Pune");
//        Address address = new Address(city);
//        helloService.setName("Amit");
//        helloService.setAddress(address);

        ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");

        //HelloService helloService = (HelloService) context.getBean("helloService");
        HelloService helloService = context.getBean("helloService", HelloService.class);

        helloService.sayHello();
    }
}

