package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student joe = new Student(
                    "Joe",
                    "joeg05@gmail.com",
                    LocalDate.of(1981, Month.NOVEMBER, 23)
            );
            Student matt = new Student(
                    "Matt",
                    "mattg@gmail.com",
                    LocalDate.of(1990, Month.NOVEMBER, 5)
            );

            repository.saveAll(
                    List.of(joe, matt)
            );
        };
    }
}
