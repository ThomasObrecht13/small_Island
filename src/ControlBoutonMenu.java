import java.awt.event.*;
import javax.swing.*;

public class ControlBoutonMenu implements ActionListener {

    FenetreNewGame fen;

    public ControlBoutonMenu(FenetreNewGame fenetreNewGame)
    {
        this.fen = fenetreNewGame;

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == fen.button1)
        {
            fen.panelButton.setVisible(false);
            fen.panJoueur.setVisible(true);
            fen.joueur2.setVisible(false);
            fen.joueur3.setVisible(false);
            fen.joueur4.setVisible(false);
            Joueur joueur1 = new Joueur();
        }

        if (e.getSource() == fen.button2)
        {
            fen.panelButton.setVisible(false);
            fen.panJoueur.setVisible(true);
            fen.joueur3.setVisible(false);
            fen.joueur4.setVisible(false);
            Joueur joueur1 = new Joueur();
            Joueur joueur2 = new Joueur();
        }

        if(e.getSource() == fen.button3)
        {
            fen.panelButton.setVisible(false);
            fen.panJoueur.setVisible(true);
            fen.joueur4.setVisible(false);
            Joueur joueur1 = new Joueur();
            Joueur joueur2 = new Joueur();
            Joueur joueur3 = new Joueur();
        }

        if(e.getSource() == fen.button4)
        {
            fen.panelButton.setVisible(false);
            fen.panJoueur.setVisible(true);
            Joueur joueur1 = new Joueur();
            Joueur joueur2 = new Joueur();
            Joueur joueur3 = new Joueur();
            Joueur joueur4 = new Joueur();
        }

        if (e.getSource() == fen.butValidate)
        {
            fen.panJoueur.setVisible(false);
            fen.panDificulty.setVisible(true);
        }

        if(e.getSource() == fen.difficulty1 )
        {
            FenetreSquelette fenS = new FenetreSquelette();
        }

        if(e.getSource() == fen.difficulty2)
        {
            FenetreSquelette fen = new FenetreSquelette();
        }
    }
}
