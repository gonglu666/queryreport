package com.ebm.service.schedule;

import com.ebm.dao.schedule.UsersDao;
import com.ebm.model.schedule.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gonglu on 2018/5/1.
 */
@Service
@Transactional(readOnly = true)
public class UsersService {
    @Autowired
    private UsersDao usersDao;

    public List<Users> getUsers(){
        return usersDao.getUsers();
    }
}
