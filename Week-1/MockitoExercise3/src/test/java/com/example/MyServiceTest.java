package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {

        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub method
        when(mockApi.getData(anyString())).thenReturn("Mock Data");

        // Create service
        MyService service = new MyService(mockApi);

        // Call method
        String result = service.fetchData("Tejaswini");

        // Verify interaction with any String
        verify(mockApi).getData(anyString());

        // Verify output
        assertEquals("Mock Data", result);
    }
}