package com.vaishnavi.practice.spring.service;

import com.vaishnavi.practice.spring.model.Student;

public class StudentService {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void showStudentInfo() {
        student.displayInfo();
    }
}


