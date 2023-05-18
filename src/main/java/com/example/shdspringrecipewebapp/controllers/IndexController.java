package com.example.shdspringrecipewebapp.controllers;

import com.example.shdspringrecipewebapp.model.Category;
import com.example.shdspringrecipewebapp.model.UnitOfMeasure;
import com.example.shdspringrecipewebapp.repositories.CategoryRepository;
import com.example.shdspringrecipewebapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> category = categoryRepository.findByCategoryName("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Tablespoon");

        System.out.println("\nCategory '" + category.get().getCategoryName() + "' ID: " + category.get().getId());
        System.out.println("Unit of Measure '" + unitOfMeasure.get().getDescription() + "' ID: " + unitOfMeasure.get().getId());

        return "index";
    }
}
