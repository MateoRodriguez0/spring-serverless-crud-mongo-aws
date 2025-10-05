package com.example;

import com.example.model.Category;
import com.example.model.CookingTime;
import com.example.model.PreparationTime;
import com.example.model.Recipe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class SpringServerlessCrudTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServerlessCrudTutorialApplication.class, args);
    }
}
