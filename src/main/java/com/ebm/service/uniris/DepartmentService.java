package com.ebm.service.uniris;


import com.ebm.dao.uniris.DepartmentDao;
import com.ebm.model.uniris.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gonglu on 2018/5/1.
 */
@Service
@Transactional(readOnly = true)
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;


    public List<Department> getDepartments(String deptid){
        return departmentDao.get(deptid);
    }





















}
