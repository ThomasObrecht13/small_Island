import java.util.ArrayDeque;
import java.util.List;

public class Joueur
{
    private String nom;
    private CarteObjectif carteObjectif;
    private int pointPrestige;
    ArrayDeque<CarteObjectif> pioche;


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

}
