package com.hdh.dubbo.rpc;

import com.hdh.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangdonghua on 2018/1/7.
 */
public class RpcContext {

    private static UserService userService = null;;

    private static ClassPathXmlApplicationContext context = null;
    static
    {
        context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer.xml"});
        context.start();
    }

    public synchronized static UserService getRemoteUserService()
    {
        if (userService == null)
        {
            userService = (UserService)context.getBean("userService");
        }
        return userService;
    }

}
