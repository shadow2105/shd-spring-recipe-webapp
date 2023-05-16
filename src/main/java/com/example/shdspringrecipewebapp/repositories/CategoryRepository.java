package com.example.shdspringrecipewebapp.repositories;

import com.example.shdspringrecipewebapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
