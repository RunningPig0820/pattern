package com.taosha.pattern.decorator.service;

import com.taosha.pattern.decorator.common.ResultMsg;

/**
 * @ClassName SigninService
 * @Description 抽象构件类
 * @Author zhangMin
 * @Date 2018/12/18 20:58
 * @Version 1.0
 **/
public interface SiginService {

    /**
     * 注册的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password);


}
