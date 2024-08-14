package com.example.unit_test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MyService {
    private final MyRepository myRepository;

    public String find(Long id){
        return myRepository.find(id);
    }

    public String delete(Long id){
        return myRepository.delete(id);
    }

    public String update(Long id){
        return myRepository.update(id);
    }
}
