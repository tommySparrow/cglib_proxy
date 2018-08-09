package com;

import com.impl.UserManagerImpl;
import com.interfaces.UserManager;
import com.proxy.CglibProxy;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/8/8
 * @ Description：
 * @ throws
 */

public class main {
    public static void main(String[] args) {
        CglibProxy jdkProxy = new CglibProxy();
        UserManager userManager = (UserManager)jdkProxy.getCglibProxy(new UserManagerImpl());
        userManager.delUser("xiaoming");
        System.out.println("4.执行结束----------------");

    }
}
