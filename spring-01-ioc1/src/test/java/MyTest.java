import com.qinwei.dao.UserDaoMysqlImpl;
import com.qinwei.dao.UserOracleImpl;
import com.qinwei.dao.UserSqlServerImpl;
import com.qinwei.service.UserService;
import com.qinwei.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        //获取applicationContext：拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么直接get
        UserServiceImpl userserviceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userserviceImpl.getUser();

//        //用户实际调用的是业务层，dao层不需要接触
//        UserService userService = new UserServiceImpl();
//        userService.setUserDao(new UserOracleImpl());
//        userService.getUser();
//
//        userService.setUserDao(new UserSqlServerImpl());
//        userService.getUser();
    }
}
