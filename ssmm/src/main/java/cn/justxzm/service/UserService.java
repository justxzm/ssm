package cn.justxzm.service;

import cn.justxzm.dao.UserDao;
import cn.justxzm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by XZM on 2017/3/30.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public boolean register(User user){
        return userDao.register(user);
    }
    public User login(String username,String password){
        return userDao.login(username,password);
    }
}
