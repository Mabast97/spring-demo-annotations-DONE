package myMainPackage;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Inside DatabaseFortuneService class's getFortune Method";
    }

}
