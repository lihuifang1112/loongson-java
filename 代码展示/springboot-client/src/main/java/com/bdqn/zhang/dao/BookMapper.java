package com.bdqn.zhang.dao;

import com.bdqn.zhang.pojo.Book;

import java.util.List;


public interface BookMapper {

    List<Book> getAll();

    Book getOne(Integer id);

    int update(Book book);

    int add(Book book);

    int del(Integer id);

    int count();
}
