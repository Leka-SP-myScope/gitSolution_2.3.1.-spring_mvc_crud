package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserService userService;

    @Autowired
    public UserServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @Override
    public User findById(Long id) {
        return userService.findById(id);
    }

    @Override
    public void saveUser(User user) {
        userService.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userService.updateUser(user);
    }

    @Override
    public void deleteById(Long id) {
        userService.deleteById(id);
    }
}
