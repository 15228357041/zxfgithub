package com.test.common.activemq;

import java.io.Serializable;

/**
 * @ClassName TestMessage
 * @Description 消息模型
 * @Author yehao
 * @Date 2018/4/7 12:52
 * @Version 1.0
 **/
public class TestMessage implements Serializable {
    private static final long serialVersionUID = -2132582539599141027L;

    private Integer id;
    private String msg;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    @Override
    public String toString() {
        return "TestMessage [id=" + id + ", msg=" + msg + "]";
    }
}
