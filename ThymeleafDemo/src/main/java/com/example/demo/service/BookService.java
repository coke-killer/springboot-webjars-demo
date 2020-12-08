package com.example.demo.service;

import com.example.demo.bean.Book;
import com.example.demo.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookService {
    @Resource
    BookMapper bookMapper;
    public List<Book> getAll() {
        return bookMapper.getAll();
    }
}
