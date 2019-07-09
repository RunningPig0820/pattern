package com.taosha.pattern;

import com.taosha.pattern.delegate.Leader;
import org.junit.Test;

/**
 * @ClassName DelegateTest
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/21 11:03
 * @Version 1.0
 **/
public class DelegateTest {
    @Test
    public void test_delegate(){
        new Leader().doing("加密");
    }
}
