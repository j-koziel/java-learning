package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    @GetMapping("")
    public List<Student> getStudents() {
        return List.of(new Student(1L,
                "Mariam",
                "mariamjamal@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21));
    }
}
