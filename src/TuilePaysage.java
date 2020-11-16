import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class TuilePaysage {
    ArrayList<TuilePaysage> pioche = null;
    private static Random loto = new Random(Calendar.getInstance().getTimeInMillis());

    // contituer la pioche des tuiles de paysages.
    public void  contitutionPioche(){
        pioche = new ArrayList<>(56);

        // mélange de la pioche
        TuilePaysage temp;
        int t1, t2;
        for (int i = 0; i<20; i++){
            t1 = loto.nextInt(56);
            t2 = loto.nextInt(56);
            if (t1 != t2){
                temp = pioche.get(t1);
                pioche.set(t1, pioche.get(t2));
                pioche.set(t2,temp);
            }
        }
    }
}
