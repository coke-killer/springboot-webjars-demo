package com.example.demo.bean;

import lombok.Data;

@Data
public class Book {
    private Integer id;
    private User user;
    private String isbn;
    private String name;
    private String price;
    private String publisher;
    private String pages;
    private String cover;
}
