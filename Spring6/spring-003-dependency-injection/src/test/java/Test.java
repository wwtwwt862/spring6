import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sunmk.bean.Cat;
import org.sunmk.bean.Person;
import org.sunmk.bean.YuQian;
import org.sunmk.jdbc.MyDataSource;
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

    @org.junit.Test
    public void testArray(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        YuQian yuQianBean = applicationContext.getBean("YuQianBean", YuQian.class);
        System.out.println(yuQianBean);
    }

    @org.junit.Test
    public void testList(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("List.xml");
        Person person = applicationContext.getBean("Person", Person.class);
        System.out.println(person);}
    @org.junit.Test
    public void testNull(){
            ClassPathXmlApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("Cat.xml");
            Cat catBean = applicationContext1.getBean("catBean", Cat.class);
            System.out.println(catBean);
        }

    @org.junit.Test
    public void testProperties(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_properties.xml");
        MyDataSource datasourceBean = applicationContext.getBean("datasourceBean", MyDataSource.class);
        System.out.println(datasourceBean);
        //此处有一个小瑕疵，username会首先去访问系统的username，所以以后写尽量改为
//        jdbc.username
    }

}
