package com.ebm.service.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by gonglu on 2018/5/4.
 */
public class StrFactory {
    private static SimpleDateFormat sf= new SimpleDateFormat("yyyyMMddHHmmss");
    private static  SimpleDateFormat sfPase= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static String getStr(String str,String prefix,String suffix){
        int start = str.indexOf(prefix);
        int end = str.indexOf(suffix);
        if(start==-1&&end==-1){
            return str;
        }

        return  str.substring(start+prefix.length(),end).replaceAll("\\r\\n\\t"," ");
    }

    public  static String getDateString(String beginDate) throws ParseException{
        return sf.format(sfPase.parse(beginDate));
    }
    public static String getDateFormat(String beginDate) throws ParseException{
        return sfPase.format(sf.parse(beginDate));
    }
    public  static  void main(String [] args){
        System.out.println("123456".indexOf("0"));
    }

}
