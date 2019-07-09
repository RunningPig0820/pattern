package com.taosha.pattern.decorator.service.Impl;

import com.taosha.pattern.decorator.common.Member;
import com.taosha.pattern.decorator.common.ResultMsg;
import com.taosha.pattern.decorator.service.SiginService;

/**
 * @ClassName SigninServiceImpl
 * @Description 具体构件类
 * @Author zhangMin
 * @Date 2018/12/18 21:01
 * @Version 1.0
 **/
public class SiginServiceImpl implements SiginService {
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200,"注册成功",new Member());
    }
}
