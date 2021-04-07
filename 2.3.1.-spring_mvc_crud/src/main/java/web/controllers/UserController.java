package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import web.dao.UserDao;
import web.model.User;

import java.util.List;


@Controller
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping
    public String getFirstPage() {
        return "users_list";
    }

    @GetMapping("/users")
    public String getAllUser(Model model) {
        List<User> allUser = userDao.getAllUser();
        model.addAttribute("allUser", allUser);
        return "users_list";
    }

    @GetMapping("/user_create")
    public String createUserAndShow(User user) {
        return "user_create";
    }

    @PostMapping("/user_create")
    public String createUser(User user) {
        userDao.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/user_delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userDao.deleteById(id);
        return "redirect:/users";
    }

    @GetMapping("/user_update/{id}")
    public String saveUserAndShow(@PathVariable("id") Long id, Model model) {
        User user = userDao.findById(id);
        model.addAttribute("user", user);
        return "user_update";
    }

    @PostMapping("/user_update")
    public String saveUser(User user) {
        userDao.saveUser(user);
        return "redirect:/users";
    }
}
