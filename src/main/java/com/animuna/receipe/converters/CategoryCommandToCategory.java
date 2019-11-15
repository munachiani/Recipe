package com.animuna.receipe.converters;

import com.animuna.receipe.commands.CategoryCommand;
import com.animuna.receipe.model.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand categoryCommand) {
        if (categoryCommand != null) {
            final Category category = new Category();
            category.setId(categoryCommand.getId());
            category.setDescription(categoryCommand.getDescription());
            return category;
        }
        return null;
    }
}
