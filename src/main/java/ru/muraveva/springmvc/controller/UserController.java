package ru.muraveva.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.muraveva.springmvc.dao.UserDaoImpl;

@Controller
@RequestMapping("/")
public class UserController {

    private final UserDaoImpl userDao;

    @Autowired
    public UserController(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @GetMapping
    public String index(Model model) {
//        model.addAttribute("users", userDao.index());
        return "index";
    }
}
