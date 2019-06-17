/**
 * Created by Лизаза
 * On 11.06.2019.
 */
public class HerbFish extends Fish {
    HerbFish() {
        super();
    }

    @Override
    public void herbEat(Grass grs) {
        if(this.isHungry)
        {
            isHungry=false;
            double temp = grs.Size;
            grs.Size=-(temp/5);
        }


    }
}

