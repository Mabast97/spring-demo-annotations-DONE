package myMainPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("1");
        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println("2");
        // call a method on the bean
       System.out.println(theCoach.getDailyFortune());
        System.out.println("3");
       // System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }

}
