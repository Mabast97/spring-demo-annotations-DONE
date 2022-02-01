package myMainPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatSillyCoach")   // Explicit bean ID

@Component // for using the default bean ID which is the class name with the first letter in LowerCase
@Scope("prototype")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Inside TennisCoach's No-Argument Constructor");
    }

    @PostConstruct
    public void startUp()
    {
        System.out.println("StartUp Method");
    }

    @PreDestroy
    public void endUp()
    {
        System.out.println("EndUp Method");
    }

    /*
    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
        System.out.println(theFortuneService.getFortune());

        fortuneService = theFortuneService;
    }
*/

/*
    // setter injection
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside ThennisCoach's setFortuneService");
        this.fortuneService = fortuneService;
    }

    // method injection
    @Autowired
    public void someOtherMethod(FortuneService fortuneService) {
        System.out.println("Inside ThennisCoach's someOtherMethod");
        this.fortuneService = fortuneService;
    }
*/
    //    @Autowired
//    public TennisCoach(FortuneService theFortuneService)
//    {
//        fortuneService = theFortuneService;
//        System.out.println("Inside TennisCoach's Constructor");
//    }

    @Override
    public String getDailyWorkout() {
        return "Inside getDailyWorkout in TennisCoach";
    }

    @Override
    public String getDailyFortune() {
        return "Inside getDailyFortune in TennisCoach : FortuneService = " + fortuneService.getFortune();
    }

}
