package com.itheibai.user.sys.service.impl;

import com.itheibai.user.sys.pojo.User;
import com.itheibai.user.sys.dao.UserDao;
import com.itheibai.user.sys.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author itheibai
 * @since 2022-04-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> getByKeyword(String keyword) {
        return userDao.getUserByKeyword(keyword);
    }
}
