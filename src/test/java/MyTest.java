import com.bai.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void manual(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 一种获取方式
        Person person1 = (Person) applicationContext.getBean("person1");
        // 另一种获取方式
        Person person2 = applicationContext.getBean("person2", Person.class);
        Person person3 = applicationContext.getBean("person3", Person.class);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

    @Test
    public void autoByXML(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        当没有为id为pet的bean时装配失败
        Person person4 = context.getBean("person4", Person.class);

//        但是类为Pet的子类却可以被byType捕获到
        Person person5 = context.getBean("person5", Person.class);

        System.out.println(person4);
        System.out.println(person5);
    }
}
