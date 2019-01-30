package com.test.common.util;

/**
 * @classname: EncryptionUtil
 * @description: TODO
 * @author: duanzhiyun
 * @date: 2018/4/27 14:42
 * @version: 1.0
 * 加密工具类，含多个机密方式
 **/

public class EncryptionUtil {

    public static  String  md5(String param){
        String md5 = MD5Util.md5(param);
        return md5;
    }
}
