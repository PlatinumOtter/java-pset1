/**
 * Created by Daniel Jackson on 5/6/2015.
 */
public class Egyptians {

    private Egyptians(){}

    private static Egyptians egyptians;

    public static Egyptians getInstance(){
        if(egyptians == null){
            egyptians =  new Egyptians();
        }
        return egyptians;
    }

    public Pyramid creation(int n){
        Pyramid giza = new Pyramid();
        giza.builder(n);
        return giza;
    }
}
