package com.hdh.dubbo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by huangdonghua on 2018/1/7.
 */
public class DubboProvider {

    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"dubbo-provider.xml"});
        context.start();
        System.out.println("demo provider started.......");
        while (true)
        {
            try
            {
                Thread.currentThread().sleep(5*1000);
                System.out.println("demo provider heartbeat at:"+(new Date().getTime()/1000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}
