import java.util.ArrayList;
import java.util.List;

public class Partie {

    private int nbrJoueur;
    private int difficulte;
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();


    public Partie(){



    }


    public void placement(){

    }


    public void choix_joueur()
    {

    }

    public int nombre_joueur()
    {
        return nbrJoueur;
    }

    public void difficulté(){

    }
    public Joueur aGagner(){
        List<Joueur> joueurs;
        int max = Integer.MAX_VALUE;
        /*for(Joueur j : joueurs){
            if(j.getTotalPointPrestige()> max)
                max = j.getTotalPointPrestige();
            return j;
        }*/
        return null;
    }
}
