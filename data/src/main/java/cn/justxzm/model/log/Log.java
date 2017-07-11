package cn.justxzm.model.log;

/**
 * Created by XZM on 2017/4/7.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * 日志
 */
@Data
public class Log implements Serializable {
    private static final long serialVersionUID = -8280602625152351898L;

    private String operation;   // 执行的操作
    private String currentTime; // 当前时间
}