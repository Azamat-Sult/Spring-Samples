package ru.example.sample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.example.sample1.enums.ResultCreator;

@SpringBootApplication
public class Sample1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sample1Application.class, args);
        System.out.println(ResultCreator.EPIC_FAIL.getResult());
    }

}
