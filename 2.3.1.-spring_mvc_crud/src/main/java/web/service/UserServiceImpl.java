package java.web.service;

import org.springframework.stereotype.Service;

import java.web.dao.UserDao;
import java.web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
