package com.example.service;

import com.example.vo.json.UserVo;

public interface MallUserInfoService {


    UserVo userRegister(String mobile, String password) throws Exception;
}
