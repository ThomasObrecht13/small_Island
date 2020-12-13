import javax.swing.*;

public class TuileBateau {

    protected int identifiant;
    protected String couleur;
    protected ImageIcon imageIcon;

    public TuileBateau()
    {

    }

    public TuileBateau(int id, String c)
    {
        this.identifiant = id;
        this.couleur = c;
        imageIcon = new ImageIcon();
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
