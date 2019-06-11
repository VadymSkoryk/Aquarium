import java.util.Map;

/**
 * Created by Лизаза
 * On 11.06.2019.
 */
public class AquaObj {

    private Map<AquaObj,AquaCell> inside;


    public  void Growing(){}
    public AquaCell getCell(){return new AquaCell();}
    public AquaObj getObj(){return  new AquaObj();}

}
