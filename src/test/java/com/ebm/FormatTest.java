package com.ebm;


import java.text.SimpleDateFormat;

/**
 * Created by gonglu on 2018/5/4.
 */
public class FormatTest {
    public  static void main(String [] args){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMddHHmmss");
        String date = "2018-06-04 23:02:34";
        String format = "";
        try{
             format = sf1.format(sf.parse(date));
        }catch (Exception e){

        }

        System.out.println(format);
    }
}
