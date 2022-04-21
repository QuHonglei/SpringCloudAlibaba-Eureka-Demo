package com.itheibai.user.sys.dao;

import com.itheibai.user.sys.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author itheibai
 * @since 2022-04-21
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

    List<User> getUserByKeyword(String keyword);
}
