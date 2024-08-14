package com.example.unit_test;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String find(Long id){
        return "find_" + id;
    }

    public String delete(Long id){
        return "delete_" + id;
    }

    public String update(Long id){
        return "update_" + id;
    }
}
