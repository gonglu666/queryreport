package com.ebm.controller;


import com.ebm.model.pacsreport.Request;
import com.ebm.model.pacsreport.Response;

import com.ebm.model.schedule.DocInform;
import com.ebm.model.schedule.Users;
import com.ebm.model.uniris.Department;
import com.ebm.service.schedule.UsersService;
import com.ebm.service.uniris.DepartmentService;
import com.ebm.service.uniris.TestVerWorklist;
import com.ebm.service.uniris.UniRisService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


/**
 * Created by Administrator on 2018/4/29.
 */
@RestController
public class HelloController {
    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    UniRisService uniRisService;

    @Autowired
    UsersService usersService;

    @Autowired
    DepartmentService departmentService;

    @Autowired
    TestVerWorklist testVerWorklist;

    @RequestMapping(value = "/EBM", method = RequestMethod.GET)
    public String hello(Request request) {
        logger.info("statem print hello");
        return "Hello GLY,Welcome to EBM!" ;
    }

    @RequestMapping(value = "/EBM/OutpPacsReptMasterQuery", method = RequestMethod.GET)
    public Response getPacsReport(Request request) {
        Response response = uniRisService.getResponse(request);

        return response;


    }


    @RequestMapping(value = "/uniris/verworklist")
    public Response getDataRow() {
        Request request = new Request();
        request.setQueryCode("20150101");
        request.setQueryType(1);


        Response response = testVerWorklist.getResponse(request);
        return response;

    }

    @RequestMapping(value = "/uniris/department/")
    public List<Department> getDepartment() {
        return departmentService.getDepartments("01");

    }

    @RequestMapping(value = "/schedule/docinform")
    public DocInform getDocInform() {
        DocInform docInform = testVerWorklist.getDocInform();
        System.out.println(docInform.getInceptDepartment() + "" + docInform.getInceptDoctor() + " " + docInform.getInceptTime() + " " + docInform.getInspectionTime());
        return docInform;
    }

    @RequestMapping(value = "/schedule/users/")
    public List<Users> getUsers() {
        return usersService.getUsers();

    }
}
