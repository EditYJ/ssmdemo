package com.edityj.service;

import com.edityj.dao.BooksMapper;
import com.edityj.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
  private BooksMapper booksMapper;

  @Autowired
  public void setBooksMapper(BooksMapper booksMapper) {
    this.booksMapper = booksMapper;
  }

  public int addBook(Books book) {
    return booksMapper.addBook(book);
  }

  public int deleteBook(int id) {
    return booksMapper.deleteBook(id);
  }

  public int updateBook(Books book) {
    return booksMapper.updateBook(book);
  }

  public Books getBookById(int id) {
    return booksMapper.getBookById(id);
  }

  public List<Books> getBookList() {
    return booksMapper.getBookList();
  }
}
