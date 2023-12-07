import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sunmk.service.CustomerService;
import org.sunmk.service.UserService;

/**
 * PACKAGE_NAME
 *
 * @author: wwt
 * @Description TODO
 * @Date 2023/12/5 13:22
 */


public class Test {
    @org.junit.Test
    public void testSetDi(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("UserService", UserService.class);
        userService.saveUser();
    }

    @org.junit.Test
    public void testConstructorDI(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerServiceBeans = applicationContext.getBean("CustomerServiceBeans", CustomerService.class);
        customerServiceBeans.save();
    }
}
