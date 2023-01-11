package com.bdqn.zhang.controller;

import com.bdqn.zhang.service.BookService;
import com.bdqn.zhang.util.LayData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/list")
    @ResponseBody
    public LayData getAll() {
        return LayData.data(bookService.count(),bookService.getAll());
    }
}
