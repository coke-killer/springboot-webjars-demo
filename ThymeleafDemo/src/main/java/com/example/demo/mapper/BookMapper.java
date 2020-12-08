package com.example.demo.mapper;

import com.example.demo.bean.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> getAll();
}
