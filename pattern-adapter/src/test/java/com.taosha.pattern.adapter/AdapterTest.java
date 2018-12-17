package com.taosha.pattern.adapter;

import com.taosha.pattern.adapter.adapter.RegistForQQ;
import com.taosha.pattern.adapter.adapter.RegistForWeChat;
import com.taosha.pattern.adapter.adapter.common.RegistService;
import org.junit.Test;

/**
 * @ClassName AdapterTest
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/17 17:39
 * @Version 1.0
 **/

public class AdapterTest {
    @Test
    public void test_refistForQQ(){
        RegistService registService = new RegistForQQ();
        registService.regist("userName","passWord");
    }

    @Test
    public void test_refistForWeChat(){
        RegistService registService = new RegistForWeChat(new SiginForThirdService());
        registService.regist("userName","passWord");
    }
}
