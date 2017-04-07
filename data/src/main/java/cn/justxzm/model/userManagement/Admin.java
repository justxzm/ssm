package cn.justxzm.model.userManagement;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by XZM on 2017/4/2.
 */

/**
 * 管理员
 * 这里序列化，是为了向xmemcached中存储，否则会报异常；
 * 当然除了用序列化之外，还可以将admin对象转化为json串，然后进行存储
 */
public class Admin implements Serializable{

    private static final long serialVersionUID = 2074294184990768077L;

    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //将json串转为Admin
    public static Admin parseJsonToAdmin(String jsonStr){
        try {
            return JSON.parseObject(jsonStr, Admin.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //将当前实例转化为json串
    public String toJson(){
        return JSON.toJSONString(this);
    }
}
