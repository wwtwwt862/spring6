package com.sunmk.testSpring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * com.sunmk.testSpring
 *
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/4 15:55
 */


public class FirstSpringTest {
    @Test
    public void testFirstSpringCode(){
        //第一步获取spring容器对象
        //ApplicationContext 翻译为： 应用上下文，其实就是spring容器
        //ApplicationContext 是一个接口
        //ApplicationContext 接口有很多实现类，其中一个就叫做ClassPathXmlApplicationContext
        //ClassPathXmlApplicationContext 专门从类路径中加载spring配置文件的一个Spring上下文对象
        //这行代码只要执行，就相当于启动了spring容器，解析spring。xml文件，并且实例化所有的bean对象，放到spring容器中
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");

        //根据bean的id从spring容器中获取对象
        Object bean1 = applicationContext.getBean("UserBean");
        System.out.println(bean1);
    }
}
