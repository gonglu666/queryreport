package com.ebm.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by gonglu on 2018/5/1.
 */
@Configuration
@MapperScan(basePackages = "com.ebm.dao.schedule", sqlSessionTemplateRef = "sqlSessionTemplateSchedule",sqlSessionFactoryRef = "sqlSessionFactorySchedule")
public class DataSourceConfigScheduledb {
    @Bean(name = "dataSourceSchedule")
    @ConfigurationProperties(prefix = "spring.datasource.scheduledb")

    public DataSource dataSource() {

        DataSource dataSource  = DataSourceBuilder.create().build();

        return dataSource;
    }

    @Bean(name = "sqlSessionFactorySchedule")

    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSourceSchedule") DataSource dataSource) throws Exception {
//        Connection connection = dataSource.getConnection();
//        Statement stat = connection.createStatement();
//        ResultSet rs = stat.executeQuery("select a.dept_id,a.dept_name from department a");
//        while(rs.next()){
//            System.out.println(rs.getString(1)+"--"+rs.getString(2));
//
//        }
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);

        return bean.getObject();
    }

    @Bean(name = "transactionManagerSchedule")

    public DataSourceTransactionManager tansactionManager(@Qualifier("dataSourceSchedule") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sqlSessionTemplateSchedule")

    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactorySchedule") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
