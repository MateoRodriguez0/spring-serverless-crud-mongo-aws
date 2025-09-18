package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
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
