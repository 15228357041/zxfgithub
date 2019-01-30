package com.test.common.util;

import static org.apache.commons.lang.StringUtils.split;

/**
 * @classname: CheckSQLStrUtils
 * @description: 非法sql语句
 * @author: jocker
 * @date: 2018/4/13 21:50
 * @version: 1.0
 **/
public class CheckSQLStrUtils {
    public static boolean sql_inj(String str)
    {
        String inj_str = "'| and | exec | insert | select | delete | update | count | %|% | chr | mid | master | truncate | char | declare | or | -- | <script";
        String inj_stra[] = split(inj_str,"|");
        for (int i=0 ; i < inj_stra.length ; i++)
        {
            if (str.indexOf(inj_stra[i]) >= 0)
            {
                return true;
            }
        }
        return false;
    }
}
