package myMainPackage;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Inside RandomService class's getFortune Method";
    }

}
