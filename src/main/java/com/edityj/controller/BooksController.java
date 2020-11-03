package com.edityj.controller;

import com.edityj.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BooksController {
  private BooksService booksService;

  @Autowired
  @Qualifier("booksServiceImpl")
  public void setBooksService(BooksService booksService) {
    this.booksService = booksService;
  }

  @RequestMapping("/list")
  public String getBookList(Model model) {
    model.addAttribute("msg", booksService.getBookList());

    return "bookList";
  }
}
