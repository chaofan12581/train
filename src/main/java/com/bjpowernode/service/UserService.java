package com.bjpowernode.service;

import com.bjpowernode.bean.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserService{

   User userLogin(User user);
}
