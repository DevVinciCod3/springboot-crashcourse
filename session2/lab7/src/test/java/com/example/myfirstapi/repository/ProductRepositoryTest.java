package com.example.myfirstapi.repository;

import com.example.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository;

    @BeforeEach
    void setup() {
        repository = new ProductRepository();
    }

    @Test
    void testFindAllInitialSizeIsThree() {
        List<Product> product = repository.findAll();

        assertNotNull(product);
        assertEquals(3, product.size());
    }


    @Test
    void testExsitingProductID() {
        Optional<Product> product = repository.findById(1L);
        assertTrue(product.isPresent());
        assertEquals("Laptop", product.get().getName());
    }

    @Test
    void saveNewProduct_assignsIdAndAddsToList() {
        Product product = new Product("Headset", 500);
        Product saved = repository.save(product);

        assertNotNull(saved.getId());
        assertEquals("Headset", saved.getName());
        assertEquals(500, saved.getPrice());
    }

    @Test
    void saveExistingProduct_updatesDetails() {
        Product original = repository.save(new Product("Monitor", 700));
        Product updated = new Product("Monitor Pro", 999);
        updated.setId(original.getId());

        Product saved = repository.save(updated);

        assertEquals("Monitor Pro", saved.getName());
        assertEquals(999, saved.getPrice());
    }

    @Test
    void saveProductWithUnknownId_doesNotAddOrUpdate() {
        Product ghost = new Product("Ghost", 1);
        ghost.setId(9999L); // This ID doesn't exist in the repo
        repository.save(ghost);

        assertTrue(repository.findById(9999L).isEmpty());
    }




}