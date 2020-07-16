package com.m00yy.service;

import com.m00yy.dao.UserDao;
import com.m00yy.model.SysUserModel;
import com.m00yy.model.UserPersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务逻辑处理
 */
@Service
public class UserService {
    @Autowired
    private UserDao dao;

    public SysUserModel login(String username, String userpwd) {
        return dao.login(username, userpwd);
    }

    public List<UserPersonModel> selectAllPersonInfo() {
        return dao.selectAllPersonInfo();
    }

    public Integer changeStatus(String t_user_id) {
        return dao.changeStatus(t_user_id);
    }

    public Integer register(String username, String userpwd) {
        Integer count = dao.isUsernameExist(username);
        if (count > 0) {
//            用户名已经处在了，不能注册了
            count = -2;
        } else {
            count = dao.register(username, userpwd);
        }
        return count;
    }

    public Integer updateAuth(String t_user_id, String t_role) {
        return dao.updateAuth(t_user_id, t_role);
    }
}
