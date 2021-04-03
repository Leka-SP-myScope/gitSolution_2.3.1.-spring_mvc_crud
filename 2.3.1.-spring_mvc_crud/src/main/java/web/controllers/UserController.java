package java.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.web.dao.UserDao;
import java.web.model.User;

@Controller
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/users")
    public String getAllUser(Model model) {
        List<User> allUser = userDao.getAllUser();
        model.addAttribute("allUser", allUser);
        return "users_list";
    }
}
