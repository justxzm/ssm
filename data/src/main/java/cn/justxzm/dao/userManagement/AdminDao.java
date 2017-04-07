package cn.justxzm.dao.userManagement;

import cn.justxzm.mapper.userManagement.AdminMapper;
import cn.justxzm.model.userManagement.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by XZM on 2017/4/2.
 */
@Repository
public class AdminDao {
    @Autowired
    private AdminMapper adminMapper;

    public boolean register(Admin admin){
        return adminMapper.insertAdmin(admin)==1? true:false;
    }

    public Admin login(String username ,String password){
        return adminMapper.selectAdmin(username, password);
    }

    public List<Admin> findAdmin(String username, String password, int start, int limit){
        return adminMapper.getAdminByConditions(username, password, start, limit);
    }

    public int insertAdminWithBackId(Admin admin){
        return adminMapper.insertAdminWithBackId(admin);
    }

    /******************guava cache********************/
    public List<Admin> getUserByName(String username){
        return adminMapper.getUserByName(username);
    }

    /******************memcached********************/
    public Admin getUserById(int id){
        return adminMapper.selectById(id);
    }
}
