import java.util.Random;

/**
 * Created by Лизаза
 * On 10.06.2019.
 */
public abstract class Fish extends AquaObj implements Eat {
    protected static int counter ;
    protected String Name;
    protected int Age=1;
    protected final static int adultAge = 50;
    protected boolean isHungry = true;
    protected int HungryState;
    protected int MaxEat = 50;
    protected int currHungryIter=0;
    protected final static int maxHungryIter = 20;
    protected boolean isMale ;
    protected final static int maxAge = 500;
    protected final static int PregnancyPeriod = 25;
    protected int currPregnPeriod = 0;

    Fish() {
        isMale = new Random().nextBoolean();
        Name = this.getClass().getName() + counter;
        counter++;
    }

    @Override
    public void Growing() {
        this.Age++;
    }



    public void findPair(){}
    public void Pregnancy(){}

}
