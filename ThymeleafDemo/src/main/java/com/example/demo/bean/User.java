package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String password;
    private List<Book> bookList;

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
