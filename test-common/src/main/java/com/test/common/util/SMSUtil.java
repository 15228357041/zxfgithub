package com.test.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @classname: SMSUtil
 * @description: 奇点云信
 * @author: jocker
 * @date: 2018/4/12 19:16
 * @version: 1.0
 **/
public class SMSUtil {
    //系统短信(验证码短信)的key
    private static final String securityKey = "d56g12s215efg5fffghdfg0d317abfgdtgd744385brd56tgd";
    //推广短信(群发短信)的key
    private static final String serverKey = "005294704ca442d6a6c648e3b6da0605";
    /**
     * 测试发送短信
     */
    public static void main(String[] args) {
        //短信验证码测试
/*        String content="验证码8888只测试一下";
        String telephone="15130208960";
        SMSUtil .sendVerificationCode(telephone,content);*/


        //群发短信测试
        String[] telephones={"15130208960","18910932536"};
        String[] contents={"尊敬的客户151302***,这里是游巴网,欢迎注册","尊敬的客户189109***,这里是游巴网,欢迎注册"};
        Integer code = SMSUtil.sendBatchMassage(telephones, contents);
        System.out.println("群发信息返回状态码为:"+code);
    }
    /**
     * 给手机发送发送短信验证码
     * return 0 (短信发送成功)
     * return 10003 (发送频率受限)
     * return 800 (请求参数不合法)
     */
    public static Integer  sendVerificationCode(String telephone,String content) {

        try {
            JSONObject obj = new JSONObject();
            JSONObject littleObj = new JSONObject();
            littleObj.put("content", content);//通知/验证码模板参数，某些可能有多个参数
            obj.put("templateParam", littleObj.toJSONString());
            obj.put("templateCode", "SMS_70335161");// 通知模板编号，需要申请模板
            obj.put("receiver", telephone);// 手机号码
            obj.put("smsSignName", "游巴网");// 短信内容签名：如奇点云
            obj.put("account", "SMS_ACCOUNT_JHYB_001");//云信申请

            obj.put("timestamp", String.valueOf(System.currentTimeMillis()));
            obj.put("signType", "HMAC");//加密方式
            Map parameter = JSON.parseObject(obj.toJSONString(), Map.class);
            String sign = Signature.generate(HTTP.POST.method(), parameter, securityKey);
            System.out.println(sign);
            obj.put("sign", sign);
            // System.out.println(obj);
            String strURL = "https://smsapi.startdt.com/v2/sms/send";
            String res = SMSUtil.httpPost(strURL, obj.toJSONString());
            // System.out.println(res);
            JSONObject objs = JSON.parseObject(res);
            Integer code = objs.getInteger("code");
            return code;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 手机号群发短信
     * return 0 (短信发送成功)
     * return 10003 (发送频率受限)
     * return 800 (请求参数不合法)
     */
    public static Integer   sendBatchMassage(String[] telephones,String[] contents) {
        try {
            if (telephones!=null&&contents!=null&&telephones.length == contents.length) {
                JSONObject obj = new JSONObject();
                obj.put("account", "SMS_ACCOUNT_JHYB_002");
                obj.put("templateCode", "SMS_70375258");// 模板编号
                obj.put("smsSignName", "游巴网");// 短信内容签名
                obj.put("timestamp", String.valueOf(System.currentTimeMillis()));

                Map<String, Map<String, String>> tmp = new HashMap();

                for (int i = 0; i < telephones.length; i++) {
                    Map<String, String> templateParam = new HashMap<String, String>();
                    templateParam.put("content", contents[i]);
                    tmp.put(telephones[i], templateParam);
                }

                obj.put("receiverParams", JSON.toJSONString(tmp, SerializerFeature.DisableCircularReferenceDetect));
                obj.put("signType", "HMAC");
                Map<String, String> parameter = JSON.parseObject(obj.toJSONString(), Map.class);
                obj.put("receiverParams", tmp);

                // 计算接口签名
                String sign = Signature.generate(HTTP.POST.method(), parameter, serverKey);
                obj.put("sign", sign);

                System.out.println(obj.toJSONString());

                String strURL = "https://sms.startdtapi.com/market/sms/sendBatch";
                String res = httpPost(strURL, JSON.toJSONString(obj, SerializerFeature.DisableCircularReferenceDetect));
                JSONObject objs = JSON.parseObject(res);
                System.out.println(res);
                Integer code = objs.getInteger("code");
                return code;
            }else{
                return 800;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //


        return null;
    }

    private static String httpGet(String path) {
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try {
            // GET请求直接在链接后面拼上请求参数
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            // Get请求不需要DoOutPut
            conn.setDoOutput(false);
            conn.setDoInput(true);
            // 设置连接超时时间和读取超时时间
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(10000);
            // 连接服务器
            conn.connect();
            // 取得输入流，并使用Reader读取
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result.toString();
    }

    private static String httpPost(String strURL, String params) {
        try {
            BufferedReader bufferedReader = null;
            StringBuffer result = new StringBuffer();

            URL url = new URL(strURL);// 创建连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod("POST"); // 设置请求方式
            connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
            connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式
            connection.connect();
            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8"); // utf-8编码
            out.append(params);
            out.flush();
            out.close();

            // 接受连接返回参数
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
            }
            bufferedReader.close();
            return result.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url
     *            发送请求的URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
}
