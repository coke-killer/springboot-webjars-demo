package com.example.demo.controller;

import com.example.demo.bean.Book;
import com.example.demo.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TemplateController {
    @Resource
    BookService bookService;

    @GetMapping("thymeleaf")
    public String index(Model model) {
        List<Book> list = bookService.getAll();
        System.out.println(list);
        model.addAttribute("books", list);
        //模板名称：实际目录为 resource/templates/thymeleaftemp.html
        return "thymeleaftemp";
    }

    @GetMapping("/test")
    public String test(@RequestParam String name, HttpServletRequest request) {
        System.out.println(name);
        request.setAttribute("name1", "xiaowang");
        request.getSession().setAttribute("name2", "xxx");
        request.getServletContext().setAttribute("name3", "xiaoyu");
        return "test";
    }
}
