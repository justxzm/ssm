package cn.justxzm.dao;

import cn.justxzm.mapper.UserMapper;
import cn.justxzm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by XZM on 2017/3/30.
 */
@Repository
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    public boolean register(User user){
        return userMapper.insertUser(user)==1? true:false;
    }

    public User login(String username,String password){
        return userMapper.selectByUsernameAndPwd(username,password);
    }
}
