package com.ebm.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * Created by gonglu on 2018/5/2.
 */
@EnableWs
@Configuration
public class WebServiceConfig  extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {

        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ebm/*");
    }

    @Bean(name = "countries")
    public DefaultWsdl11Definition defaultWsdl11Definition(@Qualifier("xsdSchema") XsdSchema xsdSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CountreisPort");
        wsdl11Definition.setLocationUri("/ebm/countries");
        wsdl11Definition.setTargetNamespace("http://www.ebm.com/webservice");
        wsdl11Definition.setSchema(xsdSchema);
        return wsdl11Definition;
    }

    @Bean(name = "xsdSchema")
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("countries.xsd"));
    }

    @Bean(name = "pacsreport")
    public DefaultWsdl11Definition getPacsReqBean(@Qualifier("pacsreportXsdSchema") XsdSchema xsdSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PacsReportPort");
        wsdl11Definition.setLocationUri("/ebm/pacsreport");
        wsdl11Definition.setTargetNamespace("http://www.ebm.com/webservice");
        wsdl11Definition.setSchema(xsdSchema);
        return wsdl11Definition;
    }

    @Bean(name = "pacsreportXsdSchema")
    public XsdSchema pacsReportSchema() {
        return new SimpleXsdSchema(new ClassPathResource("pacsreport.xsd"));
    }




}
