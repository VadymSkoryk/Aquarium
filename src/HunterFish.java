import java.util.Random;

/**
 * Created by Лизаза
 * On 10.06.2019.
 */
public class Fish extends AquaObj {
    private static int counter ;
    private String Name;
    private int Age=1;
    private final static int adultAge = 50;
    private boolean isHungry = true;
    private int currHungryIter=0;
    private final static int maxHungryIter = 20;
    private boolean isMale ;
    private final static int maxAge = 500;
    private final static int PregnancyPeriod = 25;
    private int currPregnPeriod = 0;

    public Fish() {
        isMale = new Random().nextBoolean();
        Name = this.getClass().getName() + counter;
        counter++;
    }

    @Override
    public void Growing() {
        this.Age++;
    }

    public void Eat(){}
    public void findPair(){}
    public void Pregnancy(){}

}
