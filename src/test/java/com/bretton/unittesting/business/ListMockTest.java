package com.bretton.unittesting.business;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListMockTest {
    List mock = mock(List.class);

    @Test
    public void basic_test(){
         when(mock.size()).thenReturn(5);
        assertEquals(5,mock.size());
    }


    @Test
    public void returnDifferentValues(){
        when(mock.size()).thenReturn(5).thenReturn(10);
        assertEquals(5,mock.size());
        assertEquals(10,mock.size());
    }

    @Test
    public void returnWithParameters(){
        when(mock.get(0)).thenReturn("NguruTheGuru");
        assertEquals("NguruTheGuru",mock.get(0));
    }

}
