// package org;

// import org.acme.BuzzResource;
// import org.acme.service.BuzzService;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.*;
// import org.acme.model.Buzz;
// import java.util.*;

// import jakarta.ws.rs.core.Response;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.*;

// public class BuzzResourceTest {

// @Mock
// private BuzzService buzzService;

// @InjectMocks
// private BuzzResource buzzResource;

// @BeforeEach
// public void setUp() {
// MockitoAnnotations.openMocks(this);
// }

// // @Test
// // public void testSaveBuzz() {

// // // Test case for saveBuzz method
// // Buzz buzz = new Buzz();
// // buzz.setContent("Test content");
// // buzz.setAuthor("Test author");

// // Response response = buzzResource.saveBuzz(buzz);

// // assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
// // verify(buzzService, times(1)).createBuzz(buzz);

// // }

// // @Test
// // public void testGetAllBuzzes() {
// // // Test case for getAllBuzzes method
// // List<Buzz> buzzes = new ArrayList<>();
// // buzzes.add(new Buzz());
// // buzzes.add(new Buzz());
// // when(buzzService.getAllBuzzes()).thenReturn(buzzes);

// // List<Buzz> response = buzzResource.getAllBuzzes();

// // assertEquals(buzzes, response);
// // verify(buzzService, times(1)).getAllBuzzes();
// // }

// // @Test
// // public void testDeleteBuzz() {
// // // Test case for deleteBuzz method
// // Long id = 1L;
// // when(buzzService.deleteBuzz(id)).thenReturn(true);

// // Response response = buzzResource.deleteBuzz(id);

// // assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
// // verify(buzzService, times(1)).deleteBuzz(id);
// // }
// }
