package web.dao;


import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
    User findById(Long id);
    User saveUser(User user);
    void deleteById(Long id);
}
