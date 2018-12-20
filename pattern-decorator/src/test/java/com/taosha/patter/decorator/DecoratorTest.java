package com.taosha.patter.decorator;

import com.taosha.pattern.decorator.common.ResultMsg;
import com.taosha.pattern.decorator.service.Impl.RegistForThirdService;
import com.taosha.pattern.decorator.service.Impl.SiginServiceImpl;
import com.taosha.pattern.decorator.service.SiginService;
import org.junit.Test;

/**
 * @ClassName DecoratorTest
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/20 20:40
 * @Version 1.0
 **/
public class DecoratorTest {

    @Test
    public void test(){
        RegistForThirdService siginService = new RegistForThirdService(new SiginServiceImpl());
        siginService.registForQQ("openId");
    }
}
