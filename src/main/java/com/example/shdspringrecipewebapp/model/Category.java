package com.example.shdspringrecipewebapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
