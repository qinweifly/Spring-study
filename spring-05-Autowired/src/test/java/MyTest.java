import com.qinwei.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans111111.xml");

        People people = context.getBean("people", People.class);
        System.out.println(people.toString());
        people.getCat().shout();
        people.getDog().shout();
    }
}
