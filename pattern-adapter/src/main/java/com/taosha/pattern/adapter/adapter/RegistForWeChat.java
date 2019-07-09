package com.taosha.pattern.adapter.adapter;

import com.taosha.pattern.adapter.SiginForThirdService;
import com.taosha.pattern.adapter.adapter.common.RegistService;
import com.taosha.pattern.adapter.common.ResultMsg;

/**
 * @ClassName RegistForWeChat
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/17 17:35
 * @Version 1.0
 **/
public class RegistForWeChat  implements RegistService {

    SiginForThirdService siginForThirdService;

    public RegistForWeChat(SiginForThirdService siginForThirdService) {
        this.siginForThirdService = siginForThirdService;
    }

    public ResultMsg regist(String username, String password) {
        String openId = username + password;
        return siginForThirdService.regist(openId);
    }
}
