package com.edityj.dao;

import com.edityj.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
  int addBook(Books book);

  int deleteBook(@Param("bookId") int id);

  int updateBook(Books book);

  Books getBookById(@Param("bookId") int id);

  List<Books> getBookList();
}
