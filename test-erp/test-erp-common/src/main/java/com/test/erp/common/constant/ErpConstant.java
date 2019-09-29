package com.test.erp.common.constant;

import com.test.common.base.BaseConstants;

import java.util.HashMap;

/**
 * upms系统常量类
 * Created by test on 2017/2/18.
 */
public class ErpConstant extends BaseConstants {

    public static final String ERP_TYPE = "test.erp.type";


        /**
         * 用户相关
         */
        //用户类型常量    1-低频  2-高频
        public static final Byte USER_TYPE_LOWFREQUENCY = 1;
        public static final Byte USER_TYPE_HIGHFREQUENCY = 2;

        //车队用户类型常量   1-车队总管理员  2-车队调度员/财务
        public static final Integer MOTORCADE_USER_ADMIN = 1;
        public static final Integer MOTORCADE_USER_OTHERS = 2;

        //车队来源类型常量   10-运维  20-代理平台
        public static final Integer SOURCE_FROM_ADMIN = 10;
        public static final Integer SOURCE_FROM_AGENT = 20;

        //用户来源类型常量   10-交易平台  20-代理平台  30-客服平台 40-车队erp
        public static final Integer USER_FROM_ADMIN = 10;
        public static final Integer USER_FROM_AGENT = 20;
        public static final Integer USER_FROM_SERVICE = 30;
         public static final Integer USER_FROM_MTCERP = 40;


        /**
         * 车队相关
         */
        //车队开通状态常量    0-未开通  1-已开通
        public static final Boolean REGION_MOTORCADE_OPEN = true;
        public static final Boolean REGION_MOTORCADE_CLOSE = false;

        /**
         * 地区相关
         */
        //地区层级常量    1-省级地区 2-地级市
        public static final Integer REGION_LEVEL_PROVINCE = 1;
        public static final Integer REGION_LEVEL_CITY = 2;


        /**
         * 车辆相关
         */
        //车辆座位类型常量   1-普通 2-豪华;
        public static final Integer SEAT_NORMAL = 1;
        public static final Integer SEAT_LUXURY = 2;


        /**
         * 订单相关
         */
        //需求单表状态order_requisition -10-已删除 0-已废除 10-建立 20-意向订单 30-已下单 40-已支付 50-已调度 60-行程中 70-返程中 80-已完成
        public static final Integer ORDER_REQUISITION_DELETE = -10;
        public static final Integer ORDER_REQUISITION_INVALID = 0;
        public static final Integer ORDER_REQUISITION_ESTABLISH = 10;
        public static final Integer ORDER_REQUISITION_INTENT = 20;
        public static final Integer ORDER_REQUISITION_ORDERED = 30;
        public static final Integer ORDER_REQUISITION_RESERVED = 35;
        public static final Integer ORDER_REQUISITION_PAID = 40;
        public static final Integer ORDER_REQUISITION_DISPATCHED = 50;
        public static final Integer ORDER_REQUISITION_RUNNING = 60;
        public static final Integer ORDER_REQUISITION_BACKING = 70;
        public static final Integer ORDER_REQUISITION_COMPLETED = 80;

        public static HashMap<Integer, String> orderRequisitionMap;
        static {
            orderRequisitionMap = new HashMap<Integer, String>();
            orderRequisitionMap.put(ORDER_REQUISITION_DELETE, "已删除");
            orderRequisitionMap.put(ORDER_REQUISITION_INVALID, "已废除");
            orderRequisitionMap.put(ORDER_REQUISITION_ESTABLISH, "建立");
            orderRequisitionMap.put(ORDER_REQUISITION_INTENT, "意向订单");
            orderRequisitionMap.put(ORDER_REQUISITION_ORDERED, "已下单");
            orderRequisitionMap.put(ORDER_REQUISITION_RESERVED, "线下预留");
            orderRequisitionMap.put(ORDER_REQUISITION_PAID, "已支付");
            orderRequisitionMap.put(ORDER_REQUISITION_DISPATCHED, "已确认调度");
            orderRequisitionMap.put(ORDER_REQUISITION_RUNNING, "行程中");
            orderRequisitionMap.put(ORDER_REQUISITION_BACKING, "返程中");
            orderRequisitionMap.put(ORDER_REQUISITION_COMPLETED, "已完成");
        }

        //订单号生成类型常量  01-VIP订单 02-订车订单 03-高频账户充值 04-订单尾款支付  05-低频订金支付
        public static final String ORDER_NUM_VIP = "01";
        public static final String ORDER_NUM_BUS = "02";
        public static final String ORDER_NUM_RECHARGE = "03";
        public static final String ORDER_NUM_REMAININGFUND = "04";
        public static final String ORDER_NUM_LOWFREQUENCY = "05";

        //订单号生成类型常量  1-VIP订单 2-订车订单 3-高频账户充值 4-订单尾款支付  5-低频订金支付
        public static final Integer PAY_ORDER_TYPE_VIP = 1;
        public static final Integer PAY_ORDER_TYPE_BUS = 2;
        public static final Integer PAY_ORDER_TYPE_RECHARGE = 3;
        public static final Integer PAY_ORDER_TYPE_REMAININGFUND = 4;
        public static final Integer PAY_ORDER_TYPE_LOWFREQUENCY = 5;

        //询价单状态常量 -10-失效;0-未查看，未报价;5-已查看，未报价;10-已报价;15-未中标;20-已中标;
        public static final Integer BARGAIN_INVALID = -10;
        public static final Integer BARGAIN_NOTVIEWED = 0;
        public static final Integer BARGAIN_VIEWED = 5;
        public static final Integer BARGAIN_QUOTED = 10;
        public static final Integer BARGAIN_UNSELECTED = 15;
        public static final Integer BARGAIN_SELECTED = 20;

        //订单支付类型常量  1-全款支付 2-订金支付 3-挂账支付
        public static final Integer ORDER_PAY_ALL = 1;
        public static final Integer ORDER_PAY_DEPOSIT = 2;
        public static final Integer ORDER_PAY_CREDIT = 3;

        public static HashMap<Integer, String> orderPayMap;
        static {
            orderPayMap = new HashMap<Integer, String>();
            orderPayMap.put(ORDER_PAY_ALL, "全额支付");
            orderPayMap.put(ORDER_PAY_DEPOSIT, "订金支付");
            orderPayMap.put(ORDER_PAY_CREDIT, "挂账支付");
        }

        //订单状态常量   -10-删除 0-未确认调度 10-已确认调度
        public static final Integer ORDER_FORM_DELETE = -10;
        public static final Integer ORDER_FORM_NORMAL = 0;
        public static final Integer ORDER_FORM_DISPATCHED = 10;

        //订单类型常量    1-低频电话订单 2-低频需求单订单 3-高频电话订单 4-高频询价单订单 5-高频简要订单 6-线下补单 7-线下预留车
        public static final Byte ORDER_TYPE_LOWFREQUENCY_PHNOE = 1;
        public static final Byte ORDER_TYPE_LOWFREQUENCY_DEMAND = 2;
        public static final Byte ORDER_TYPE_HIGHFREQUENCY_PHNOE = 3;
        public static final Byte ORDER_TYPE_HIGHFREQUENCY_INQUIRY = 4;
        public static final Byte ORDER_TYPE_HIGHFREQUENCY_SUMMARY = 5;
        public static final Byte ORDER_TYPE_HIGHFREQUENCY_REMEDY = 6;
        public static final Byte ORDER_TYPE_HIGHFREQUENCY_RESERVED = 7;

        public static HashMap<Byte, String> orderTypeMap;
        static {
            orderTypeMap = new HashMap<Byte, String>();
            orderTypeMap.put(ORDER_TYPE_LOWFREQUENCY_PHNOE, "低频电话订单");
            orderTypeMap.put(ORDER_TYPE_LOWFREQUENCY_DEMAND, "低频需求单订单");
            orderTypeMap.put(ORDER_TYPE_HIGHFREQUENCY_PHNOE, "高频电话订单");
            orderTypeMap.put(ORDER_TYPE_HIGHFREQUENCY_INQUIRY, "高频询价单订单");
            orderTypeMap.put(ORDER_TYPE_HIGHFREQUENCY_SUMMARY, "高频简要订单");
            orderTypeMap.put(ORDER_TYPE_HIGHFREQUENCY_REMEDY, "线下补单");
            orderTypeMap.put(ORDER_TYPE_HIGHFREQUENCY_RESERVED, "线下预留车");
        }

        //订单车辆状态常量 0-未开始;10-出场;20-出发;30-到达;40-返程;50-已完成;
        public static final Integer ORDER_BUS_STATUS_STANDBY = 0;
        public static final Integer ORDER_BUS_STATUS_APPEARANCE= 10;
        public static final Integer ORDER_BUS_STATUS_DEPART = 20;
        public static final Integer ORDER_BUS_STATUS_ARRIVED = 30;
        public static final Integer ORDER_BUS_STATUS_RETURN = 40;
        public static final Integer ORDER_BUS_STATUS_COMPLETED = 50;

        //尾款支付状态 0-未支付;10-已支付;
        public static final Integer ORDER_FORM_FINAL_PAYMENT_STATUS_UNPAID = 0;
        public static final Integer ORDER_FORM_FINAL_PAYMENT_STATUS_PAID= 10;

        //支付状态 0-未支付;10-已支付;
        public static final Integer ORDER_PAYMENT_STATUS_REFUND = -5;
        public static final Integer ORDER_PAYMENT_STATUS_UNPAID = 0;
        public static final Integer ORDER_PAYMENT_STATUS_PAID= 10;

        /**
         * 支付相关
         */
        //订金规则常量   1-百分比 2-分段
        public static final Integer DEPOSIT_PERSENT = 1;
        public static final Integer DEPOSIT_SECTION = 2;

        //财务支付方式常量   1-微信 2-支付宝 3-线下 4-抹零
        public static final Integer PAY_TYPE_WECHAT = 1;
        public static final Integer PAY_TYPE_ALIPAY = 2;
        public static final Integer PAY_TYPE_OFFLINE = 3;
        public static final Integer PAY_TYPE_ZERO = 4;

        //支付渠道类型    1-微信 2-支付宝 3-银联 4-线下
        public static final Integer PAY_CHANNEL_WECHAT = 1;
        public static final Integer PAY_CHANNEL_ALIPAY = 2;
        public static final Integer PAY_CHANNEL_UNIONPAY = 3;
        public static final Integer PAY_CHANNEL_OFFLINE = 4;

        //是否需要发票常量  T-是 F-否
        public static final Boolean INVOICE_NEED_TRUE = true;
        public static final Boolean INVOICE_NEED_FALSE = false;

        //收款单状态 0-正常;-10-废除;
        public static final Integer FINANCE_RECEIVED_STATUS_NORMAL = 0;
        public static final Integer FINANCE_RECEIVED_STATUS_INVALID = -10;

        //应收单状态 0-正常;-10-废除;
        public static final Integer FINANCE_RECEIVABLE_STATUS_NORMAL = 0;
        public static final Integer FINANCE_RECEIVABLE_STATUS_INVALID = -10;

        //冲账单状态 0-正常;-10-废除;
        public static final Integer FINANCE_BALANCE_STATUS_NORMAL = 0;
        public static final Integer FINANCE_BALANCE_STATUS_INVALID = -10;

        //退款单状态 0-正常;-10-废除;
        public static final Integer FINANCE_REFUND_STATUS_NORMAL = 0;
        public static final Integer FINANCE_REFUND_STATUS_INVALID = -10;

        //应收单类型 1-订单转入;2-手工应收款单;
        public static final Integer FINANCE_RECEIVABLE_TYPE_AUTO = 1;
        public static final Integer FINANCE_RECEIVABLE_TYPE_MANUAL = 2;

        /**
         * 任务相关
         */
        //往返类型常量    1-单程 2-往返
        public static final Integer ORDER_RUNNING_SINGLE = 1;
        public static final Integer ORDER_RUNNING_ROUNDTRIP = 2;

        //调度表车辆每日状态常量 0-空闲 10-预留车锁定 20-订单锁定 30-出车 40-空车回程 50-维护锁定 60-人工锁定
        public static final Integer BUS_DAILY_FREE = 0;
        public static final Integer BUS_DAILY_INTENTLOCK = 10;
        public static final Integer BUS_DAILY_ORDERLOCK = 20;
        public static final Integer BUS_DAILY_BUSGO = 30;
        public static final Integer BUS_DAILY_BUSBACK = 40;
        public static final Integer BUS_DAILY_MAINTENANCE = 50;
        public static final Integer BUS_DAILY_MANUALLOCK = 60;

        //任务状态常量  0-未开始  10-出场  20-出发 30-到达（往返任务） 40-返程（往返任务）  50-完成
        public static final Integer TASK_READY = 0;
        public static final Integer TASK_OUT = 10;
        public static final Integer TASK_START = 20;
        public static final Integer TASK_ARRIVE = 30;
        public static final Integer TASK_BACK = 40;
        public static final Integer TASK_COMPLETED = 50;

        /**
         * 其它
         */
        //状态常量（用户，车队，车辆，司机）   -10-删除 0-禁用 3-审核不通过 5-待审核 10-正常
        public static final Integer DEL_FLAG = -10;
        public static final Integer BAN_FLAG = 0;
        public static final Integer CHECKNO_FLAG = 3;
        public static final Integer CHECK_FLAG = 5;
        public static final Integer NORMAL_FLAG = 10;

        //便签类型常量    1-文字 2-图片 3-录音
        public static final Integer MEMO_WORD = 1;
        public static final Integer MEMO_PICTURE = 2;
        public static final Integer MEMO_RECORD = 3;

        //客服处理类型常量  T-是(1) F-否(0)
        public static final Integer CUSTOM_SERVICE_TRUE = 1;
        public static final Integer CUSTOM_SERVICE_FALSE = 0;

        //功能菜单类型常量 0-菜单 1-操作
        public static final Integer FUNCTION_MENU = 0;
        public static final Integer FUNCTION_OPERATION = 1;

        //消息对列相关
        public static final Integer MOTORCADE_QUEUE_ORDER = 1;
        public static final Integer MOTORCADE_QUEUE_SCHEDULING = 2;

        //消息对列相关-类名
        public static final String  QUEUE_MOTORCADEMQ = "MotorcadeMQ";

        //七牛公钥/密钥
        public static final String QINIU_ACCESS_KEY = "Q63eZthleB3WKG-j7Iu4amClsZOb_uM8MxwC68v1";
        public static final String QINIU_SECRET_KEY = "5_VE9WmHXY_DTU_SVczBduiNy7YWvvfppxtYnElr";

        //七牛bucket地址
        public static final String QINIU_PUBLIC_BUCKET_DOMAIN = "http://p31ehpdhj.bkt.clouddn.com";
        public static final String QINIU_SECRET_BUCKET_DOMAIN = "http://p2zikcbug.bkt.clouddn.com";
        public static final Integer QINIU_BUCKET_PREFIX_LENGTH = 33;

        //支付类型 0-APP支付; 1-扫码支付（WEB支付）;
        public static final Integer IS_NOT_SCAN= 0;
        public static final Integer IS_SCAN = 1;

        //消息阅读类型 0-未读; 1-已读;
        public static final Integer IS_NOT_READ= 0;
        public static final Integer IS_READ = 1;

        //消息类型 101-游巴用户报价消息; 102-游巴用户车辆调度消息; 201-车队; 301-司机;
        public static final Integer MSG_TESTUSER= 101;
        public static final Integer MSG_TESTUSER_SCHEDULING= 102;
        public static final Integer MSG_MOTORCADE = 201;
        public static final Integer MSG_DRIVER = 301;

        //普通需求单客服处理状态:-1-已放弃;0-未处理;1-已处理，未完成;2-已完成;
        public static final Integer CUSTOMER_INVALID= -1;
        public static final Integer CUSTOMER_NOT_DEAL= 0;
        public static final Integer CUSTOMER_DEAL_STATUS= 1;
        public static final Integer CUSTOMER_FINISH= 2;

        public static final String customerServiceAchievementsUrl = "http://testagadmin.chinatest.com/agprofitrecord/insert.htm";

}
