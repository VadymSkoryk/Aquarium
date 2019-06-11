import java.util.Map;

/**
 * Created by Лизаза
 * On 11.06.2019.
 */
public class AquaObj {
    private boolean isEatable;
    private boolean isMoving;
    private boolean isGrowing;
    private Map<AquaObj,AquaCell> inside;

    public void Move(){}
    public void Growing(){}
    public AquaCell getCell(){return new AquaCell();}
    public AquaObj getObj(){return  new AquaObj();}

}
