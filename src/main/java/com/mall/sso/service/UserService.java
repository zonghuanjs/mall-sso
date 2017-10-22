package com.mall.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mall.common.pojo.ResultBean;
import com.mall.pojo.User;

public interface UserService {

	ResultBean checkData(String content, Integer type);

	ResultBean createUser(User user);

	ResultBean userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);

	ResultBean getUserByToken(String token);
	
	void test();
}
