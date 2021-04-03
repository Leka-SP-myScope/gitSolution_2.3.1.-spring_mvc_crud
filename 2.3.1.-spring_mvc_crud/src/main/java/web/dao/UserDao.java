package java.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
    User findById(Long id);
    User saveUser(User user);
    void deleteById(Long id);
}
