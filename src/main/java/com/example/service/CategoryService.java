package com.example.service;

import com.example.dto.CategoryDto;
import com.example.model.Category;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    private List<CategoryDto> categories;

    public List<CategoryDto> findAll() {
        return List.copyOf(categories);
    }

    @PostConstruct
    private void init(){
        this.categories = Arrays.stream(Category.values())
                .map(this::createCategoryDto)
                .collect(Collectors.toList());
    }

    private CategoryDto createCategoryDto(Category id){
        String category = switch (id) {
            case ENTRANTES_Y_APERITIVOS -> "Entrantes y Aperitivos";
            case SOPAS_Y_CREMAS -> "Sopas y Cremas";
            case ENSALADAS -> "Ensaladas";
            case PLATOS_PRINCIPALES -> "Platos Principales";
            case GUARNICIONES -> "Guarniciones";
            case PASTELERIA -> "Pastelería";
            case POSTRES -> "Postres";
            case BEBIDAS -> "Bebidas";
            case SALSAS_Y_ADEREZOS -> "Salsas y Aderezos";
            case SNACKS -> "Snacks";
            case DESAYUNO -> "Desayuno";
            case ALMUERZO -> "Almuerzo";
            case CENA -> "Cena";
            case VEGETARIANO -> "Vegetariano";
            case VEGANO -> "Vegano";
            case MARISCOS -> "Mariscos";
            case CARNE -> "Carne";
            case AVES -> "Aves";
            case INTERNACIONAL -> "Internacional";
        };

        return new CategoryDto(id, category);
    }
}
