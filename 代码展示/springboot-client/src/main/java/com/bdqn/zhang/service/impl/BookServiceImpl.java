package com.bdqn.zhang.service.impl;

import com.bdqn.zhang.dao.BookMapper;
import com.bdqn.zhang.pojo.Book;
import com.bdqn.zhang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }

    @Override
    public Book getOne(Integer id) {
        return bookMapper.getOne(id);
    }

    @Override
    public int update(Book book) {
        return bookMapper.update(book);
    }

    @Override
    public int add(Book book) {
        return bookMapper.add(book);
    }

    @Override
    public int del(Integer id) {
        return bookMapper.del(id);
    }

    @Override
    public int count() {
        return bookMapper.count();
    }
}
