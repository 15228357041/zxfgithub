package com.test.erp.common.constant;

import com.test.common.base.BaseResult;

/**
 * @description ERP平台常量枚举类
 * @author yehao
 * @date 2018/4/21 14:24
 **/
public class ErpResult extends BaseResult {
    public ErpResult(ErpResultConstant erpResultConstant, Object data) {
        super(erpResultConstant.getCode(), erpResultConstant.getMessage(), data);
    }

}
