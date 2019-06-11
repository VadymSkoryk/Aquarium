import java.util.Random;

/**
 * Created by Лизаза
 * On 11.06.2019.
 */
public class Grass extends AquaObj{
    private final static int maxSize = 15;
    private int Size;

    public Grass() {
        Size = new Random().nextInt(15);
    }

    @Override
    public void Growing() {
        this.Size++;
    }
}
