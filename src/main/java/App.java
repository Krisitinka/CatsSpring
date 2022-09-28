import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean1= (Cat) applicationContext.getBean("cat");
        Cat bean3= (Cat) applicationContext.getBean("cat");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean==bean2);
        System.out.println(bean1==bean3);
        System.out.println(bean.getMessage());
    }
}