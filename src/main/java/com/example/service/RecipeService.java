package com.example.service;

import com.example.model.Recipe;
import com.example.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public Page<Recipe> listAll(Pageable pageable){
        return recipeRepository.findAll(pageable);
    }

    public Recipe listById(String id){
        return recipeRepository.findById(id).orElse(null);
    }

    public Recipe save(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    public Recipe update(String id, Recipe recipe){
        recipe.setId(id);
        return recipeRepository.save(recipe);
    }

    public void delete(String id){
        recipeRepository.deleteById(id);
    }
}
