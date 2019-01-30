package com.test.common.util;

import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 */
public class DateUtil {
    /**
     * 按照yyyy-MM-dd HH:mm:ss的格式，字符串转日期
     * @param date
     * @return
     */
    public static Date str2Date(String date){
        if(StringUtils.isNotBlank(date)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                return sdf.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Date();
        }else{
            return null;
        }
    }

    /**
     * 按照yyyy-MM-dd HH:mm:ss的格式，获取当前年份的开始日期
     * @return
     */
    public static String yearStart(){
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        year+="-01-01 00:00:00";
        return year;
    }
    public static String yearEnd(){
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        year+="-12-30 23:59:59";
        return year;
    }

    /**
     * 按照参数format的格式，日期转字符串
     * @param date
     * @param format
     * @return
     */
    public static String date2Str(Date date, String format){
        if(date!=null){
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(date);
        }else{
            return "";
        }
    }
    /**
     * 得到n天之前的日期
     * @param days
     * @return
     */
    public static String getBeforeDayDate(String days) {
        int daysInt = Integer.parseInt(days);

        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.add(Calendar.DATE, -daysInt); // 日期减 如果不够减会将月变动
        Date date = canlendar.getTime();
        SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdfd.format(date);
        return dateStr;
    }
    /**
     * 得到n天之前的日期
     * @param days
     * @return
     */
    public static Date getBeforeDay(String days) {
        int daysInt = Integer.parseInt(days);

        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.add(Calendar.DATE, -daysInt); // 日期减 如果不够减会将月变动
        Date date = canlendar.getTime();
//        SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd");
//        String dateStr = sdfd.format(date);
        return date;
    }
    /**
     * 得到n天之后的日期
     * @param days
     * @return
     */
    public static String getAfterDayDate(String days) {
        int daysInt = Integer.parseInt(days);

        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
        Date date = canlendar.getTime();

        SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdfd.format(date);

        return dateStr;
    }

    /**
     * 得到n天之后是周几
     * @param days
     * @return
     */
    public static String getAfterDayWeek(String days) {
        int daysInt = Integer.parseInt(days);

        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
        Date date = canlendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("E");
        String dateStr = sdf.format(date);

        return dateStr;
    }
    //一年后
    public static Date afterYear(){
        Calendar curr = Calendar.getInstance();
        curr.set(Calendar.YEAR,curr.get(Calendar.YEAR)+1);
        Date date=curr.getTime();
        return date;
    }
    //一月后
    public static Date afterMonth(){
        Calendar curr = Calendar.getInstance();
        curr.set(Calendar.MONTH,curr.get(Calendar.MONTH)+1);
        Date date=curr.getTime();
        System.out.println("一月后的时间====="+date.toString());
        return date;
    }
    //获取某个日期本月的截止时间
    public static String getEndDayOfMonth(String Date) {
        Date d =  str2Date(Date);
        Calendar calendar = Calendar.getInstance();
        if(null != d) calendar.setTime(d);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
        int day = calendar.getActualMaximum(5);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), day);
        String end = date2Str(calendar.getTime(),"yyyy-MM-dd HH:mm:ss");
        return end;
    }

    /**
     * 根据开始时间和结束时间返回时间段内的时间集合
     *
     * @param beginDate
     * @param endDate
     * @return List
     */
    public static List<Date> getDatesBetweenTwoDate(Date beginDate, Date endDate) {
        List<Date> lDate = new ArrayList<Date>();
        lDate.add(beginDate);// 把开始时间加入集合
        Calendar cal = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        cal.setTime(beginDate);
        boolean bContinue = true;
        while (bContinue) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            cal.add(Calendar.DATE,1);
            // 测试此日期是否在指定日期之后
            if (endDate.after(cal.getTime())) {
                lDate.add(cal.getTime());
            } else {
                break;
            }
        }
        lDate.add(endDate);// 把结束时间加入集合
        return lDate;
    }
    //根据起始时间求日期列表
    public static List<String> getDateList(String start, String end) {
        List<String> dlist=new ArrayList<String>();
        dlist.add(start);// 把开始时间加入集合
        System.out.println("开始日期====="+start);
        if(start.equals(end)){//开始时间和结束时间一致
            return dlist;
        }
        boolean bContinue = true;
        String begin=start;
        while (bContinue) {
            //获得一天后日期
            String after = getSpecifiedDayAfter(begin);
            begin=after;
            System.out.println("一天后日期====="+after);
            if (!after.equals(end)) {
                dlist.add(after);
            } else {
                break;
            }
        }
        dlist.add(end);// 把结束时间加入集合
        System.out.println("结束日期====="+end);
        return dlist;
    }

    //根据起始时间求月份列表
    public static List<String> getMonthList(String start, String end) {
        List<String> dlist=new ArrayList<String>();
        dlist.add(start);// 把开始时间加入集合
        System.out.println("开始日期====="+start);
        if(start.equals(end)){//开始时间和结束时间一致
            return dlist;
        }
        boolean bContinue = true;
        String begin=start;
        while (bContinue) {
            //获得一个月后日期
            String after = getSpecifiedDayMonth(begin);
            begin=after;
            System.out.println("一个月后日期====="+after);
            if (!after.equals(end)) {
                dlist.add(after);
            } else {
                break;
            }
        }
        dlist.add(end);// 把结束时间加入集合
        System.out.println("结束日期====="+end);
        return dlist;
    }

    /**
     * 获得指定日期的后一天
     * @param specifiedDay
     * @return
     */
    public static String getSpecifiedDayAfter(String specifiedDay){
        Calendar c = Calendar.getInstance();
        Date date=null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day=c.get(Calendar.DATE);
        c.set(Calendar.DATE,day+1);
        String dayAfter=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayAfter;
    }

    /**
     * 获得指定日期的后一天
     * @param specifiedDay
     * @return
     */
     public static String getDayAfter(String specifiedDay){
        Calendar c = Calendar.getInstance();
        Date date=null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day=c.get(Calendar.DATE);
        c.set(Calendar.DATE,day+1);
        String dayAfter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime());
        return dayAfter;
    }
    /**
     * 获得指定日期一个月后的时间
     * @param specifiedDay
     * @return
     */
    public static String getSpecifiedDayMonth(String specifiedDay){
        Calendar c = Calendar.getInstance();
        Date date=null;
        try {
            date = new SimpleDateFormat("yy-MM").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int month=c.get(Calendar.MONTH);
        c.set(Calendar.MONTH,month+1);
        String dayAfter=new SimpleDateFormat("yyyy-MM").format(c.getTime());
        return dayAfter;
    }
    /*
    * 获取规定时间段内的某个日期
     * @param
     * @return java.lang.String
    * @author zhuxufeng
    * @date 2018/4/18 13:44
    **/
    public static Date randomDate(String beginDate, String endDate) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date start = format.parse(beginDate);// 开始日期
            Date end = format.parse(endDate);// 结束日期
            if (start.getTime() >= end.getTime()) {
                return null;
            }
            long date = random(start.getTime(), end.getTime());

            return new Date(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static long random(long begin, long end) {
        long rtnn = begin + (long) (Math.random() * (end - begin));
        if (rtnn == begin || rtnn == end) {
            return random(begin, end);
        }
        return rtnn;
    }

    /**
     * 根据已知事件得到n天之后的日期
     * @param days
     * @return
     */
    public static Date getDayDate(Date d, String days) {
        int daysInt = Integer.parseInt(days);

        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.setTime(d);
        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
        Date date = canlendar.getTime();
        return date;
    }

    /**
     * 随机获取一个规定时间段内的早上8点到晚上8点的date数据
     *
     * @return
     * @author jqlin
     */
    public static Date isEffectiveDate(String startDate,String endDate)  throws ParseException {
        Boolean isBetween=false;
        String now="";
        Date  nowTime = new Date();
        String start="08:00:00";
        String endn = "20:00:00";
        do{
            String format = "HH:mm:ss";
              nowTime =randomDate(startDate,endDate);
             now =date2Str(nowTime,"HH:mm:ss");
            Date nowTime2 = new SimpleDateFormat(format).parse(now);
            Date startTime = new SimpleDateFormat(format).parse(start);
            Date endTime = new SimpleDateFormat(format).parse(endn);
            if (nowTime2.getTime() == startTime.getTime()
                    || nowTime2.getTime() == endTime.getTime()) {
                isBetween = true;
            }

            Calendar date = Calendar.getInstance();
            date.setTime(nowTime2);

             Calendar begin = Calendar.getInstance();
            begin.setTime(startTime);

            Calendar end = Calendar.getInstance();
            end.setTime(endTime);

            if (date.after(begin) && date.before(end)) {
                isBetween = true;
            } else {
                isBetween = false;
            }
        }while(!isBetween);
        return nowTime;
    }

}
