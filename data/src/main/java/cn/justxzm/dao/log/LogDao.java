package cn.justxzm.dao.log;

/**
 * Created by XZM on 2017/4/7.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.justxzm.mapper.log.LogMapper;
import cn.justxzm.model.log.Log;

/**
 * 日志DAO
 */
@Repository
public class LogDao {

    @Autowired
    private LogMapper logMapper;

    /***************注解*****************/
    public boolean insertLog(Log log) {
        return logMapper.insertLog(log) == 1 ? true : false;
    }

}