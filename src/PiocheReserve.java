import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class PiocheReserve {
    ArrayList<TuilePaysage> piocheReserve;

    public PiocheReserve(){
        piocheReserve = new ArrayList<TuilePaysage>(56);
    }

    public ArrayList<TuilePaysage> getPiocheTuilesPaysage(){
        return piocheReserve;
    }
    public void setPiocheTuilesPaysage(ArrayList<TuilePaysage> test){
        piocheReserve=test;
    }

    // constituer la pioche des tuiles de paysages.
    public void  constitutionPioche(){
        piocheReserve = new ArrayList<>(56);
        Random loto = new Random(Calendar.getInstance().getTimeInMillis());
        // mélange de la pioche
        TuilePaysage temp;
        int t1, t2;
        for (int i = 0; i<20; i++){
            t1 = loto.nextInt(56);
            t2 = loto.nextInt(56);
            if (t1 != t2){
                temp = piocheReserve.get(t1);
                piocheReserve.set(t1, piocheReserve.get(t2));
                piocheReserve.set(t2,temp);
            }
        }
    }

    public TuilePaysage piocheUneTuilePaysage(){
        TuilePaysage retour = piocheReserve.get(0);
        piocheReserve.remove(0);
        return retour;
    }
}
