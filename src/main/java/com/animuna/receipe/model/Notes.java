package com.animuna.receipe.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;

    public Notes(){}

    public Notes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }

    public Notes(String recipeNotes, Recipe recipe) {
        this.recipeNotes = recipeNotes;
        this.recipe = recipe;
    }

}
