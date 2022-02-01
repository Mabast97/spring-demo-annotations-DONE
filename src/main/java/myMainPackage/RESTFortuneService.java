package myMainPackage;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return  "Inside RESTFortuneService class's getFortune Method";
    }

}
