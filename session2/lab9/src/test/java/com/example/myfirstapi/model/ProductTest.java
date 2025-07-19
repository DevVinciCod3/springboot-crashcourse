package com.example.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product("Demo Product", 300);
        product.setId(104532L);
    }


    // Getters
    @Test
    void getId_returnsCorrectId() {
        assertEquals(104532L, product.getId());
    }

    @Test
    void getName_returnsCorrectName() {
        assertEquals("Demo Product", product.getName());
    }

    @Test
    void getPrice_returnsCorrectPrice() {
        assertEquals(300.0, product.getPrice());
    }

    // Setters
    @Test
    void setId_updatesId() {
        product.setId(202101257L);
        assertEquals(202101257L, product.getId());
    }

    @Test
    void setName_updatesName() {
        product.setName("Updated Product");
        assertEquals("Updated Product", product.getName());
    }

    @Test
    void setPrice_updatesPrice() {
        product.setPrice(999);
        assertEquals(999.0, product.getPrice());
    }

    // toString
    @Test
    void toString_returnsExpectedFormat() {
        String expected = "Product{id=104532, name='Demo Product', price=300.0}";
        assertEquals(expected, product.toString());
    }

    // equals
    @Test
    void equals_sameValues_returnsTrue() {
        Product other = new Product("Demo Product", 300);
        other.setId(104532L);
        assertEquals(product, other);
    }

    @Test
    void equals_differentId_returnsFalse() {
        Product other = new Product("Demo Product", 300);
        other.setId(999L);
        assertNotEquals(product, other);
    }

    // hashCode
    @Test
    void hashCode_equalObjects_returnsSameHash() {
        Product other = new Product("Demo Product", 300);
        other.setId(104532L);
        assertEquals(product.hashCode(), other.hashCode());
    }
}
