import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Joueur
{
    private String nom;
    private CarteObjectif carteObjectif;
    private int pointPrestige;
    ArrayDeque<CarteObjectif> pioche;
    private ArrayList<Maison> handMaisons = new ArrayList<Maison>();
    private String couleurChoisie;



    public CarteObjectif piocheCarteObjectif()
    {
        return pioche.getFirst();
    }

    public String getNom()
    {
        return  nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
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

    public void setCouleurChoisie(String couleurChoisie) {
        this.couleurChoisie = couleurChoisie;
    }
}
