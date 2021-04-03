package java.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.web.dao.UserDao;

@Controller
public class UserController {

    private UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping()
    public String getAllUser(Model model) {
        model.addAttribute("allUsers", userDao.getAllUser());
        return "users";
    }
}
