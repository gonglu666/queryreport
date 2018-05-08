package com.ebm.model.uniris;

/**
 * Created by gonglu on 2018/5/4.
 */
public class Department {
    private String dept_id;
    private String dept_name;
    private String dept_type;
    private String upd_user;
    private String upd_date;
    private String upd_time;

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_type() {
        return dept_type;
    }

    public void setDept_type(String dept_type) {
        this.dept_type = dept_type;
    }

    public String getUpd_user() {
        return upd_user;
    }

    public void setUpd_user(String upd_user) {
        this.upd_user = upd_user;
    }

    public String getUpd_date() {
        return upd_date;
    }

    public void setUpd_date(String upd_date) {
        this.upd_date = upd_date;
    }

    public String getUpd_time() {
        return upd_time;
    }

    public void setUpd_time(String upd_time) {
        this.upd_time = upd_time;
    }
}
