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
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 配置数据源
 * Created by gonglu on 2017/10/19.
 */
@Configuration
@MapperScan(basePackages = "com.ebm.dao.uniris", sqlSessionTemplateRef = "sqlSessionTemplate",sqlSessionFactoryRef = "sqlSessionFactory")
public class DataSourceConfigUniRis {

    @Bean(name = "dataSourceUniRis")
    @ConfigurationProperties(prefix = "spring.datasource.uniris")
    @Primary
    public DataSource dataSource() {

        DataSource dataSource  = DataSourceBuilder.create().build();

        return dataSource;
    }

    @Bean(name = "sqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSourceUniRis") DataSource dataSource) throws Exception {
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

    @Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager tansactionManager(@Qualifier("dataSourceUniRis") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sqlSessionTemplate")
    @Primary
    public SqlSessionTemplate sqlSessionTemplateUniRis(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
