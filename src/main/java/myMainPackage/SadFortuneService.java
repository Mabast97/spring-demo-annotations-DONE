package myMainPackage;

public class SadFortuneService implements FortuneService{

    public SadFortuneService(){
        System.out.println("Inside SadFortuneService's Default Constructor");
    }

    @Override
    public String getFortune() {
        return "Sad Class";
    }

}
