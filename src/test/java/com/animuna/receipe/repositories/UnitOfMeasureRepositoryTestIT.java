package com.animuna.receipe.repositories;

import com.animuna.receipe.model.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class UnitOfMeasureRepositoryTestIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByUom() {

        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByUom("Teaspoon");
        assertEquals("Teaspoon", optionalUnitOfMeasure.get().getUom());
    }

    @Test
    void findByUomCup() {

        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByUom("Cup");
        assertEquals("Cup", optionalUnitOfMeasure.get().getUom());
    }
}