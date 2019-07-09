package com.taosha.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Leader
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/21 10:55
 * @Version 1.0
 **/
public class Leader implements Target {

    private Map<String,Target> targets = new HashMap<String,Target>();


    public Leader() {
        targets.put("加密",new TargetA());
        targets.put("登录",new TargetB());
    }

    //项目经理自己不干活
    public void doing(String command) {
        targets.get(command).doing(command);
    }

}
