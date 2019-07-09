package com.taosha.pattern.decorator.service.Impl;

import com.taosha.pattern.decorator.common.ResultMsg;
import com.taosha.pattern.decorator.service.SiginService;

/**
 * @ClassName SigninForThirdService
 * @Description 装饰者类
 * @Author zhangMin
 * @Date 2018/12/20 17:47
 * @Version 1.0
 **/
public class RegistForThirdService implements SiginService {

    private SiginService siginService;

    public RegistForThirdService(SiginService siginService){
        this.siginService = siginService;
    }

    public ResultMsg registForQQ(String openId){
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）
        return siginService.regist(openId,null);
    }

    public ResultMsg regist(String username, String password) {
        return siginService.regist(username,password);
    }


}
