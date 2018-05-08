package com.ebm.dao.uniris;

import com.ebm.model.uniris.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by gonglu on 2018/5/1.
 */


public interface DepartmentDao {

    String getDepartment = "select a.dept_id,a.dept_name ,a.dept_type,a.upd_user,a.upd_date,a.upd_time from department a where a.dept_id =#{deptid} ";
    @Select(getDepartment)

    List<Department> get(@Param(value="deptid") String deptid);


}
