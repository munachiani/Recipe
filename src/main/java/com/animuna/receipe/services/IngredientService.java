package com.animuna.receipe.services;

import com.animuna.receipe.model.Ingredient;

public interface IngredientService {

    Ingredient saveIngredient(Ingredient ingredient);

    void deleteIngredientById(Long recipeId, Long ingredientId);

    Ingredient findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
