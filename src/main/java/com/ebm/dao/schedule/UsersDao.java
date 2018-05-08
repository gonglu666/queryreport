package com.ebm.dao.schedule;

import com.ebm.model.schedule.Users;
import com.ebm.model.uniris.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by gonglu on 2018/5/1.
 */

public interface UsersDao {

    @Select("select user_name,users_id from users")
    List<Users> getUsers();
}
