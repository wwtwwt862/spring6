import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
}
