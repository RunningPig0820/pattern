package com.taosha.pattern.adapter.adapter.common;

import com.taosha.pattern.adapter.common.ResultMsg;

/**
 * @ClassName SiginService
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/17 17:20
 * @Version 1.0
 **/
public interface RegistService {
    /**
     * 注册方法
     * @param username 用户名
     * @param password 手机号
     * @return
     */
    public ResultMsg regist(String username, String password);

}
