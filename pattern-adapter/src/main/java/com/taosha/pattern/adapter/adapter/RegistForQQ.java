package com.taosha.pattern.adapter.adapter;

import com.taosha.pattern.adapter.SiginForThirdService;
import com.taosha.pattern.adapter.adapter.common.RegistService;
import com.taosha.pattern.adapter.common.ResultMsg;

/**
 * @ClassName RegistForQQ
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/17 17:34
 * @Version 1.0
 **/
public class RegistForQQ  extends SiginForThirdService implements RegistService {
    public ResultMsg regist(String username, String password) {
        String openId =  password + username;
        return super.regist(openId);
    }
}
