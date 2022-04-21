package com.itheibai.user.sys.service;

import com.itheibai.user.sys.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author itheibai
 * @since 2022-04-21
 */
public interface UserService extends IService<User> {

    /**
     * 模糊查询用户信息
     * @param keyword
     * @return
     */
    List<User> getByKeyword(String keyword);
}
