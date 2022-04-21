package com.itheibai.user.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheibai.user.sys.pojo.User;
import com.itheibai.user.sys.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author itheibai
 * @since 2022-04-21
 */
@Api(tags = "部门控制类") //类名注释
@Slf4j
@RestController
@RequestMapping("/sys/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 根据用户id,查询信息
     * @param id
     * @return
     */
    @ApiOperation(value = "查询用户信息",response = User.class,httpMethod = "GET") //方法注释
    @RequestMapping("/getUserById")
    public User getUserById(Integer id) {
        User user = userService.getById(id);
        return user;
    }

    /**
     * 模糊查询用户信息
     * @param keyword
     * @return
     */
    @ApiOperation(value = "模糊查询用户信息",response = User.class,httpMethod = "GET") //方法注释
    @RequestMapping("/getUserByKeyword")
    public List<User> getUserByKeyword(String keyword) {
        List<User> userList = userService.getByKeyword(keyword);
        return userList;
    }

}
