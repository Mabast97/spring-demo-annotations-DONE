package myMainPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("myMainPackage")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // Define bean for our SadFortuneService
    @Bean
    public FortuneService sadFortuneService()
    {
        return new SadFortuneService();
    }

    // Define bean for our SwimCoach AND Inject Dependencies
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }


}
