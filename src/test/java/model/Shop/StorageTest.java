package model.Shop;

import model.Product.Book;
import model.Product.Item;
import model.exceptions.ProductNotFoundException;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StorageTest {
    Map<Item, Integer> productsCount;
    Storage s;

    @BeforeEach
    void config() {
        productsCount = new HashMap<>();
        productsCount.put(Book.builder().name("It")
                .author("Stephen King")
                .publisher("Pub")
                .price(100.5f)
                .sheetCount(900)
                .genre("Horror")
                .Article("123")
                .build(), 5);
        productsCount.put(Book.builder().name("motiy")
                .author("Stephen King")
                .publisher("Pub")
                .price(100.5f)
                .sheetCount(900)
                .genre("Horror").Article("1")
                .build(), 10);
        s = new Storage(productsCount);
    }

    @org.junit.jupiter.api.Test
    void reduceProductsTest() throws Exception {
        s.reduceProducts("1", 10);
        assertEquals(0, productsCount.get(Book.builder().name("motiy")
                .author("Stephen King")
                .publisher("Pub")
                .price(100.5f)
                .sheetCount(900)
                .genre("Horror").Article("1")
                .build()));
    }

    @org.junit.jupiter.api.Test
    void findByArticle() throws ProductNotFoundException {
        assertEquals(s.findByArticle("123"), Book.builder().name("It")
                .author("Stephen King")
                .publisher("Pub")
                .price(100.5f)
                .sheetCount(900)
                .genre("Horror")
                .Article("123")
                .build());
    }
}