import java.util.Random;

/**
 * Created by Лизаза
 * On 11.06.2019.
 */
public class Grass extends AquaObj{
    protected final static double maxSize = 15.0;
    protected double Size;

    public Grass() {
        Size = new Random().nextDouble();
    }

    @Override
    public void Growing() {
        if(Size<maxSize)
            Size=Size*1.5;
        else return;
    }
}
