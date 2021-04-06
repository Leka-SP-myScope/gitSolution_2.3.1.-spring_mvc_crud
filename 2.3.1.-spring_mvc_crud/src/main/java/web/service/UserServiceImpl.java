package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;
import web.repository.UserRepository;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

//    private UserRepository userRepository;
//
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

//    @Override
//    public List<User> getAll() {
//        return userRepository.findAll();
//    }

    @Override
    public List<User> getAll() {
        return userDao.getAllUser();
    }

//    @Override
//    public User findById(Long id) {
//        return userRepository.getOne(id);
//    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

//    @Override
//    public void saveUser(User user) {
//        userRepository.save(user);
//    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

//    @Override
//    public void deleteById(Long id) {
//        userRepository.deleteById(id);
//    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }
}
