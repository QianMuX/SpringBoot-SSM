package com.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BookServiceTest {
    @Resource
    private BookService bookService;

    @Test
    void getById() {
        System.out.println(bookService.getById(1));
    }

    @Test
    void getAll() {
        System.out.println(bookService.getAll());
    }
}