package com.example.controller;

import com.example.model.Recipe;
import com.example.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/recipes")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping
    public ResponseEntity<Page<Recipe>> listAll(Pageable pageable){
        return ResponseEntity.ok(recipeService.listAll(pageable));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Recipe> listById(@PathVariable String id){
        return ResponseEntity.ok(recipeService.listById(id));
    }

    @PostMapping
    public ResponseEntity<Recipe> save(@RequestBody Recipe recipe){
        return ResponseEntity.ok(recipeService.save(recipe));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Recipe> update(@PathVariable String id ,@RequestBody Recipe recipe){
        return ResponseEntity.ok(recipeService.update(id, recipe));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Recipe> delete(@PathVariable String id){
        recipeService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
