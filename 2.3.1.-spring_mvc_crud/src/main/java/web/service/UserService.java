package java.web.service;

import java.web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User findById(Long id);
    User saveUser(User user);
    void deleteById(Long id);
}
