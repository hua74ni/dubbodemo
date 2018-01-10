package com.hdh.dubbo.logic;

import com.hdh.dubbo.rpc.RpcContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by huangdonghua on 2018/1/7.
 */
@Service(value = "userLogic")
@Scope("singleton")
public class UserLogic {


    public Object getUser(String id) {
        return RpcContext.getRemoteUserService().getUser(id);
    }
}
