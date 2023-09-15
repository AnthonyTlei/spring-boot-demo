package com.anthonytlei.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student s1 = new Student("Student1",
                    "student1@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5));
            Student s2 = new Student("Student2",
                    "student2@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5));
            repository.saveAll(List.of(s1, s2));
        };
    }
}
