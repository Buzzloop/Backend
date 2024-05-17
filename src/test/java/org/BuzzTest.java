package org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.acme.model.Buzz;

public class BuzzTest {

    @Test
    public void testBuzzGetterAndSetter() {
        Buzz buzz = new Buzz();
        buzz.setId(1L);
        buzz.setContent("Test content");
        buzz.setAuthor("Test author");

        assertEquals(1L, buzz.getId());
        assertEquals("Test content", buzz.getContent());
        assertEquals("Test author", buzz.getAuthor());
    }

    @Test
    public void testBuzzEquals() {
        Buzz buzz1 = new Buzz();
        buzz1.setId(1L);
        buzz1.setContent("Test content");
        buzz1.setAuthor("Test author");

        Buzz buzz2 = new Buzz();
        buzz2.setId(1L);
        buzz2.setContent("Test content");
        buzz2.setAuthor("Test author");

        assertEquals(buzz1, buzz2);
    }

    @Test
    public void testBuzzHashCode() {
        Buzz buzz1 = new Buzz();
        buzz1.setId(1L);
        buzz1.setContent("Test content");
        buzz1.setAuthor("Test author");

        Buzz buzz2 = new Buzz();
        buzz2.setId(1L);
        buzz2.setContent("Test content");
        buzz2.setAuthor("Test author");

        assertEquals(buzz1.hashCode(), buzz2.hashCode());
    }

}
