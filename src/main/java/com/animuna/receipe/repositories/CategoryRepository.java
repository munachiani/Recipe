package com.animuna.receipe.repositories;

import com.animuna.receipe.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface  CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
