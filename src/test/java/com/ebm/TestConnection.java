package com.ebm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by gonglu on 2018/5/1.
 */
public class TestConnection {

    // 连接数据库
    final static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";          //定义SQL Server数据库的驱动程序
    final static String url = "jdbc:sqlserver://192.168.153.131:1433;DatabaseName=UNIRIS";    // 定义数据库的连接地址
    // final static String url ="jdbc:sqlserver://192.168.3.44:1433;DatabaseName=WindElec";
    final static String user = "sa";                                                      //定义数据库的连接用户名
    final static String password = "ebm_sa";                                              //连接sql数据库连接密码

    public static void main(String[] args) throws Exception {
// TODO 自动生成的方法存根

        Connection conn=null;   //数据库连接，新建Connection接口，所有数据库的操作都是从此接口开始。
        Statement stmt=null;    //申明Statement对象
        ResultSet rs=null;

        Class.forName(driver);                                       //加载驱动程序
        conn = DriverManager.getConnection(url, user, password);     //通过JDBC驱动与对应的数据库、用户名、密码相连接。getConnection（）方法的作用是取得连接对象


        if(conn !=null){
            System.out.println("数据库连接成功");
        }

        stmt = conn.createStatement();//创建Statement对象

        rs = stmt.executeQuery("select a.dept_id,a.dept_name from department a");
        while(rs.next()){
            System.out.println(rs.getString(1)+"--"+rs.getString(2));

        }

        stmt.close();                    //stmt对象关闭
        conn.close();                    //数据库关闭
    }
}
