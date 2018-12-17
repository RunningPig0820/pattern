package com.taosha.pattern.adapter;

import com.taosha.pattern.adapter.common.ResultMsg;

/**
 * @ClassName SiginForThirdService
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/17 17:28
 * @Version 1.0
 **/
public class SiginForThirdService {

    public ResultMsg regist(String openId){
        ResultMsg resultMsg = new ResultMsg("200","注册成功",openId+"成功");
        System.out.println(resultMsg.toString());
        return resultMsg;
    }

}
