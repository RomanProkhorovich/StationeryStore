package model.Shop;

import model.Product.Book;
import model.Product.Item;
import model.exceptions.ProductNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Map<Item, Integer> productsCount;
    Storage s;
    Shop shop;

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
        shop=new Shop(100,"RomaStore",s);
    }


    @Test
    void sell() throws ProductNotFoundException {
        shop.sell("1",2);
        assertEquals(301f,shop.getBalance());
        assertEquals(8,productsCount.get(s.findByArticle("1")));
    }
}