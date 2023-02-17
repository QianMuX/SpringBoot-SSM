package com.example.service.impl;

import com.example.controller.Code;
import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.exception.BusinessException;
import com.example.exception.SystemException;
import com.example.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public Boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public Boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        // 模拟业务层异常
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "非法操作！！");
        }

        // 模拟系统异常
/*        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器响应超时，请重试！");
        }*/

        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
