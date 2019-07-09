package com.taosha.pattern.decorator.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName ResultMsg
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/18 20:57
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
public class ResultMsg {
    private int code;
    private String msg;
    private Object data;
}
