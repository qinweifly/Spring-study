import com.qinwei.Student;
import com.qinwei.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.toString());
        System.out.println(student.getInfo().getProperty("学号"));
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user);

        User user2 = context.getBean("user2",User.class);
        System.out.println(user2);

        User user3 = context.getBean("user2",User.class);
        System.out.println(user2==user3);
    }

}
