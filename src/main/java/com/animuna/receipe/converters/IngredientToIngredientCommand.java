package com.animuna.receipe.converters;

import com.animuna.receipe.commands.IngredientCommand;
import com.animuna.receipe.model.Ingredient;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {

    final UnitOfMeasureToUnitOfMeasureCommand uomCommand;

    public IngredientToIngredientCommand(UnitOfMeasureToUnitOfMeasureCommand uomCommand) {
        this.uomCommand = uomCommand;
    }

    @Synchronized
    @Nullable
    @Override
    public IngredientCommand convert(Ingredient ingredient) {
        if (ingredient != null) {
            IngredientCommand ingredientCommand = new IngredientCommand();
            ingredientCommand.setId(ingredient.getId());
            if (ingredient.getRecipe() != null) {
                ingredientCommand.setRecipeId(ingredient.getRecipe().getId());
            }
            ingredientCommand.setDescription(ingredient.getDescription());
            ingredientCommand.setAmount(ingredient.getAmount());
            ingredientCommand.setUnitOfMeasure(uomCommand.convert(ingredient.getUnitOfMeasure()));
        }
        return null;
    }
}
