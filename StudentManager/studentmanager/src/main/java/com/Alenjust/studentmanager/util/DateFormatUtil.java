package com.Alenjust.studentmanager.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname DateFormatUtil
 * @Description 日期格式工具
 * @Date 2021/7/26
 * @Created Alenjust
 */
public class DateFormatUtil {
    public static String getFormatDate(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}
