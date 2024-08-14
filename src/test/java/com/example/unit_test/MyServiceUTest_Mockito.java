package com.example.unit_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MyServiceUTest_Mockito {
    @InjectMocks
    private MyService myService;

    @Mock
    private MyRepository myRepository;

    MyServiceUTest_Mockito() {
    }

    @Test
    void find() {
        when(myRepository.find(1L)).thenReturn("find_1");
        Assertions.assertEquals("find_1", myService.find(1L));
    }

    @Test
    void update() {
        when(myRepository.update(1L)).thenReturn("update_1");
        Assertions.assertEquals("update_1", myService.update(1L));
    }
}