package web.service;

import web.dao.UserDao;
import web.model.User;

import java.util.List;

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
