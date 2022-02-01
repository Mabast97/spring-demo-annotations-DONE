package myMainPackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call our new SwimCoach methods ... has the props value injected
        System.out.println("Email : " + theCoach.getEmail());
        System.out.println("Team : " + theCoach.getTeam());

        // call a method on the bean
       System.out.println(theCoach.getDailyFortune());

       // System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }

}
