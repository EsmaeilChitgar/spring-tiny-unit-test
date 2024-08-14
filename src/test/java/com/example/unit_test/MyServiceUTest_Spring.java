package com.example.unit_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

@SpringBootTest
class MyServiceUTest_Spring {
    @Autowired
    private MyService myService;

    @MockBean
    private MyRepository myRepository;

    MyServiceUTest_Spring() {
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