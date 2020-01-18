import com.qinwei.pojo.User;
import com.qinwei.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
//        User user = new User();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("userNew");
        UserT user2 = (UserT) context.getBean("U4");
        user.show();
        user2.show();

    }
}
