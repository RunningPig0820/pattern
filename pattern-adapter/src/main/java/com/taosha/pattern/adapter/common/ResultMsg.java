package com.taosha.pattern.adapter.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import sun.reflect.CallerSensitive;

/**
 * @ClassName ResultMsg
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/17 17:24
 * @Version 1.0
 **/
@AllArgsConstructor
@Data
@Builder
public class ResultMsg {
    private String code;
    private String msg;
    private Object data;
}
