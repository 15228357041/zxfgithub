package com.test.common.activemq;

import java.io.Serializable;

/**
 * @ClassName MotorcadeMQ
 * @Description 车队消息模型
 * @Author yehao
 * @Date 2018/4/7 14:53
 * @Version 1.0
 **/
public class MotorcadeMQ implements Serializable {

    private static final long serialVersionUID =  -7351729135012380019L;
    private String objTypeName;//消息类型  --比如报价
    private String msgTitle;//消息标题
    private Integer msgType;//1-待完善订单提醒  2-系统调度转人工提醒  3-客服询价完成提醒
    private String msgContent;//消息内容
    private String userId;//客服id
    private String mtcId;//车队id
    private String upmsUserId;//订车用户ID

    public String getUpmsUserId() {
        return upmsUserId;
    }

    public void setUpmsUserId(String upmsUserId) {
        this.upmsUserId = upmsUserId;
    }

    public String getMtcId() {
        return mtcId;
    }

    public void setMtcId(String mtcId) {
        this.mtcId = mtcId;
    }

    private String keyId;   //跳转用的Id

    public String getObjTypeName() {
        return objTypeName;
    }

    public void setObjTypeName(String objTypeName) {
        this.objTypeName = objTypeName;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
}
