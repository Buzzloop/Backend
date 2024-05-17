package org;

import org.acme.model.Buzz;
import org.acme.repository.BuzzRepository;
import org.acme.service.BuzzService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class BuzzServiceTest {

    @Mock
    private BuzzRepository buzzRepository;

    @InjectMocks
    private BuzzService buzzService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateBuzz() {
        // Test case for createBuzz method
        Buzz buzz = new Buzz();
        buzz.setContent("Test content");
        buzz.setAuthor("Test author");

        buzzService.createBuzz(buzz);

        verify(buzzRepository, times(1)).save(buzz);
    }

    @Test
    public void testGetAllBuzzes() {
        // Test case for getAllBuzzes method
        List<Buzz> expectedBuzzes = Collections.singletonList(new Buzz());
        when(buzzRepository.findAll()).thenReturn(expectedBuzzes);

        List<Buzz> actualBuzzes = buzzService.getAllBuzzes();

        assertEquals(expectedBuzzes, actualBuzzes);
    }

    @Test
    public void testDeleteBuzz() {
        // Test case for deleteBuzz method
        Long id = 1L;
        when(buzzRepository.deleteById(id)).thenReturn(true);

        boolean isDeleted = buzzService.deleteBuzz(id);

        assertTrue(isDeleted);
    }
}
