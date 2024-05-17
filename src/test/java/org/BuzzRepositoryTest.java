package org;

import org.acme.model.Buzz;
import org.acme.repository.BuzzRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuzzRepositoryTest {

    @InjectMocks
    private BuzzRepository buzzRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveBuzz() {
        // Test case for save method
        Buzz buzz = new Buzz();
        buzz.setContent("Test content");
        buzz.setAuthor("Test author");

        buzzRepository.save(buzz);

        List<Buzz> buzzes = buzzRepository.findAll();
        assertEquals(1, buzzes.size());
        assertEquals(buzz, buzzes.get(0));
    }

    @Test
    public void testFindAllBuzzes() {
        // Test case for findAll method when repository is empty
        List<Buzz> buzzes = buzzRepository.findAll();
        assertEquals(0, buzzes.size());

        // Test case for findAll method after saving a buzz
        Buzz buzz = new Buzz();
        buzz.setContent("Test content");
        buzz.setAuthor("Test author");
        buzzRepository.save(buzz);

        buzzes = buzzRepository.findAll();
        assertEquals(1, buzzes.size());
        assertEquals(buzz, buzzes.get(0));
    }

    @Test
    public void testDeleteBuzzById() {

        Buzz buzz = new Buzz();
        buzz.setId(1L);
        buzz.setContent("Test content");
        buzz.setAuthor("Test author");
        buzzRepository.save(buzz);

        List<Buzz> buzzes = buzzRepository.findAll();
        assertEquals(1, buzzes.size());

        buzzRepository.deleteById(1L);

        buzzes = buzzRepository.findAll();
        assertEquals(0, buzzes.size());
    }
}
