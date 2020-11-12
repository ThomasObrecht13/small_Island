import java.util.List;

public class Joueur
{
    private CarteObjectif carteObjectif;
    private int pointPrestige;
    List<CarteObjectif> carteObjectifs;

    public CarteObjectif piocheCarteObjectif()
    {
        CarteObjectif carteObjectif = null;
        // prendre la dernière carte de la pioche des cartes objectifs
        // La pioche sera une liste de type Dequeue comme comme ça on pourra renvoyer la dernière carte

        return carteObjectif;
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
