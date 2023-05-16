package com.example.shdspringrecipewebapp.repositories;

import com.example.shdspringrecipewebapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
