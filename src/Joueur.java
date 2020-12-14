import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Joueur
{
    private String nom;
    private int pointPrestige;
    private ArrayDeque<CarteObjectif> pioche;
    private ArrayList<Maison> handMaisons;
    private ArrayList<Joker> handJoker;
    private String couleurChoisie;
    private TuileBateau bateau;
    private ArrayList<TuilePaysage> handTuilesPaysages;

    public Joueur() {}

    public Joueur(String nom,String couleurChoisie){
        this.nom=nom;
        pointPrestige=0;
        pioche = new ArrayDeque<CarteObjectif>();
        handMaisons = new ArrayList<Maison>();
        bateau = new TuileBateau();
        this.couleurChoisie=couleurChoisie;
        handTuilesPaysages = new ArrayList<TuilePaysage>();
    }


    public String getNom()
    {
        return  nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setCouleurChoisie(String couleurChoisie) {
        this.couleurChoisie = couleurChoisie;
    }

    public CarteObjectif piocheCarteObjectif()
    {
        return pioche.getFirst();
    }

    public int getTotalPointPrestige()
    {
        /*for(Carte c : cartes)
        {
            // la classe carte aura un attribut point qui sera le nombre de point qu'offrira une carte
            pointPrestige+=c.getPoint();
        }*/
        return pointPrestige;
    }

    public void choixMaisons(){
        switch (couleurChoisie){
            case "rouge":
                // couleur choisie par le joueur = rouge
                for(int i = 0; i<4; i++){
                   handMaisons.add(new Maison("rouge"));
                }
                break;
            case "blanc":
                // couleur choisie par le joueur = blanc
                for(int i = 0; i<4; i++){
                    handMaisons.add(new Maison("blanc"));
                }
                break;
            case "jaune":
                // couleur choisie par le joueur = jaune
                for(int i = 0; i<4; i++){
                    handMaisons.add(new Maison("jaune"));
                }
                break;
            case "mauve":
                // couleur choisie par le joueur = mauve
                for(int i = 0; i<4; i++){
                    handMaisons.add(new Maison("mauve"));
                }
                break;
            default:
                System.out.println("Couleur indisponible");
        }
    }
    public void choixJoker(){
        switch (couleurChoisie){
            case "rouge":
                // couleur choisie par le joueur = rouge
                for(int i = 0; i<4; i++){
                    handJoker.add(new Joker("rouge"));
                }
                break;
            case "blanc":
                // couleur choisie par le joueur = blanc
                for(int i = 0; i<4; i++){
                    handJoker.add(new Joker("blanc"));
                }
                break;
            case "jaune":
                // couleur choisie par le joueur = jaune
                for(int i = 0; i<4; i++){
                    handJoker.add(new Joker("jaune"));
                }
                break;
            case "mauve":
                // couleur choisie par le joueur = mauve
                for(int i = 0; i<4; i++){
                    handJoker.add(new Joker("mauve"));
                }
                break;
            default:
                System.out.println("Couleur indisponible");
        }
    }

    public void piocherTuilePaysage(PiocheReserve pioche){
        for(int i=0 ; i<2 ; i++) {
            handTuilesPaysages.add(pioche.piocheUneTuilePaysage());
        }
    }

    public TuileBateau getBateau() {
        return bateau;
    }

    public void setBateau(TuileBateau bateau) {
        this.bateau = bateau;
    }
}
