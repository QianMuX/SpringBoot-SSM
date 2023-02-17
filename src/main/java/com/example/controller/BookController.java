package com.example.controller;

import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Resource
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        Boolean flag = bookService.save(book);
        Integer code = flag ? Code.POST_OK : Code.POST_ERR;
        String msg = flag ? "保存成功" : "保存失败";
        return new Result(code, msg, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        Boolean flag = bookService.update(book);
        Integer code = flag ? Code.PUT_OK : Code.PUT_ERR;
        String msg = flag ? "修改成功" : "修改失败";
        return new Result(code, msg, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        Boolean flag = bookService.delete(id);
        Integer code = flag ? Code.POST_OK : Code.POST_ERR;
        String msg = flag ? "删除成功" : "删除失败";
        return new Result(code, msg, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "查询成功" : "查询失败";
        return new Result(code, msg, book);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "查询成功" : "查询失败";
        return new Result(code, msg, bookList);
    }
}
