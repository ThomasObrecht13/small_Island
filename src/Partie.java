import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Partie {

    private int nbrJoueur;
    //private int difficulte;
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
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Veuillez saisir votre niveau de difficulté : " );
        String s = scanner.nextLine();
        while(s == ""){
            switch(s){
                case "normal":
                    ArrayList<CarteObjectif> cartesObj = new ArrayList<CarteObjectif>();
                    CarteObjectif c1 = new CarteObjectif();
                    CarteObjectif c2 = new CarteObjectif();
                    CarteObjectif c3 = new CarteObjectif();
                    CarteObjectif c4 = new CarteObjectif();
                    CarteObjectif c5 = new CarteObjectif();
                    CarteObjectif c6 = new CarteObjectif();
                    CarteObjectif c7 = new CarteObjectif();
                    CarteObjectif c8 = new CarteObjectif();
                    CarteObjectif c9 = new CarteObjectif();
                    CarteObjectif c10 = new CarteObjectif();
                    CarteObjectif c11 = new CarteObjectif();
                    CarteObjectif c12 = new CarteObjectif();
                    //
                    List<CarteMission> co = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
                    //
                    cartesObj.addAll(co);
                    break;

                case "avancé":
                    ArrayList<CarteMission> cartesM = new ArrayList<CarteMission>();
                    ArrayList<CarteRecompense> cartesR = new ArrayList<CarteRecompense>();
                    //
                    CarteMission cM1= new CarteMission();
                    CarteMission cM2= new CarteMission();
                    CarteMission cM3= new CarteMission();
                    CarteMission cM4= new CarteMission();
                    CarteMission cM5= new CarteMission();
                    CarteMission cM6= new CarteMission();
                    CarteMission cM7= new CarteMission();
                    CarteMission cM8= new CarteMission();
                    CarteMission cM9= new CarteMission();
                    CarteMission cM10= new CarteMission();
                    CarteMission cM11= new CarteMission();
                    CarteMission cM12= new CarteMission();
                    //
                    CarteRecompense cR1= new CarteRecompense();
                    CarteRecompense cR2= new CarteRecompense();
                    CarteRecompense cR3= new CarteRecompense();
                    CarteRecompense cR4= new CarteRecompense();
                    CarteRecompense cR5= new CarteRecompense();
                    CarteRecompense cR6= new CarteRecompense();
                    CarteRecompense cR7= new CarteRecompense();
                    CarteRecompense cR8= new CarteRecompense();
                    CarteRecompense cR9= new CarteRecompense();
                    CarteRecompense cR10= new CarteRecompense();
                    CarteRecompense cR11= new CarteRecompense();
                    CarteRecompense cR12= new CarteRecompense();

                    //
                    List<CarteMission> cms = Arrays.asList(cM1,cM2,cM3,cM4,cM5,cM6,cM7,cM8,cM9,cM10,cM11,cM12);
                    List<CarteRecompense> cmr = Arrays.asList(cR1,cR2,cR3,cR4,cR5,cR6,cR7,cR8,cR9,cR10,cR11,cR12);
                    //
                    cartesM.addAll(cms);
                    cartesR.addAll(cmr);
                    break;
                case "solo":
                    //création d'abord des cartes alexis et expéditions
                    break;
            }
        }
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
