package com.edityj.service;

import com.edityj.pojo.Books;

import java.util.List;

public interface BooksService {
  int addBook(Books book);

  int deleteBook(int id);

  int updateBook(Books book);

  Books getBookById(int id);

  List<Books> getBookList();
}
