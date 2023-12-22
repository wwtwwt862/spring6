package SpringScopeTest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sunmk.spring6.bean.SpringBean;

/**
 * SpringScopeTest
 *
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/14 15:58
 */


public class SpringBeanScopeTest {
    /**
     * spring 默认情况下是如何管理bean的
     *  默认情况下Bean是单例的，单例（singleton）
     *  在spring上下文初始化的时候实例化
     *  每次调用getbean（）方法的时候，都返回那个单例的对象
     * 当将bean的scope属性设置为prototype
     *  bean 是多例的
     *  spring上下文初始化的时候，并不会初始化这些prototype的bean
     *  每一次调用geybean（）方法的时候，实例化bean对象
     *  prototype翻译为：原型
     */
    @Test
    public void testScope(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
//        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
//        System.out.println(sb);
    }
}
