package myMainPackage;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    @Value("${email}")
    private String email;

    @Value("${team}")
    private String team;

    public SwimCoach(FortuneService theFortuneService)
    {
        System.out.println("Inside SwimCoach's Default Constructor");
        fortuneService = theFortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "getDailyWorkout inside SwimCoach";
    }

    @Override
    public String getDailyFortune() {
        return "getDailyFortune in SwimCoach, fortuneService.getFortune() = "+fortuneService.getFortune();

    }
}
