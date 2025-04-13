package com.vaishnavi.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.vaishnavi.practice.spring.service.StudentService;

public class StudentExample {
    public static void main(String[] args) {
        // Load Spring configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the StudentService bean
        StudentService studentService =
                context.getBean("studentService", StudentService.class);

        // Use the service
        studentService.showStudentInfo();
    }
}
