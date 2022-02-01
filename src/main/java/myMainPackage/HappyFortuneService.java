package myMainPackage;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Inside HappyFortuneService class's getFortune Method";
    }

}
