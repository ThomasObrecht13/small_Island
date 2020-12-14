import java.util.ArrayList;

public class PiocheNavigation {
    ArrayList<TuilePaysage> piocheNavigation;

    public PiocheNavigation() {
        piocheNavigation = new ArrayList<TuilePaysage>(6);
    }

    public void remplirPiocheNavigation(PiocheReserve pioche){
        for(int i=0 ; i<6 ; i++){
            piocheNavigation.add(pioche.piocheUneTuilePaysage());
        }
    }



}
