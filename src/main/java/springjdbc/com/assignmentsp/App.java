package springjdbc.com.assignmentsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Question1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c = new ClassPathXmlApplicationContext("config1.xml");
        Question1 q =(Question1) c.getBean("q");
        q.display();
    }
}
