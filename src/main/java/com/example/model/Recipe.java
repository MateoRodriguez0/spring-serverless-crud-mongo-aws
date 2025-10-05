package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "recipes")
public class Recipe {
    @Id
    private String id;
    private String title;
    private String description;
    private List<String> ingredients;
    private List<String> instructions;
    private Category category;
    private CookingTime cookingTime;
    private PreparationTime preparationTime;
    private int servings;
    private String notes;
}
