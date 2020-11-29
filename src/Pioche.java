import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Pioche {
    ArrayList<TuilePaysage> piocheTuilesPaysage;

    public Pioche(){
        piocheTuilesPaysage = new ArrayList<TuilePaysage>(56);
    }

    public ArrayList<TuilePaysage> getPiocheTuilesPaysage(){
        return piocheTuilesPaysage;
    }
    public void setPiocheTuilesPaysage(ArrayList<TuilePaysage> test){
        piocheTuilesPaysage=test;
    }

    // constituer la pioche des tuiles de paysages.
    public void  constitutionPioche(){
        piocheTuilesPaysage = new ArrayList<>(56);
        Random loto = new Random(Calendar.getInstance().getTimeInMillis());
        // mélange de la pioche
        TuilePaysage temp;
        int t1, t2;
        for (int i = 0; i<20; i++){
            t1 = loto.nextInt(56);
            t2 = loto.nextInt(56);
            if (t1 != t2){
                temp = piocheTuilesPaysage.get(t1);
                piocheTuilesPaysage.set(t1, piocheTuilesPaysage.get(t2));
                piocheTuilesPaysage.set(t2,temp);
            }
        }
    }

    public TuilePaysage piocheUneTuilePaysage(){
        TuilePaysage retour = piocheTuilesPaysage.get(0);
        piocheTuilesPaysage.remove(0);
        return retour;
    }
}
