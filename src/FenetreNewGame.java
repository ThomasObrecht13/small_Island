import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class FenetreNewGame extends JFrame {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    JPanel panelButton;


    public FenetreNewGame() {
        initAtribut();
        creerInterface();
        creerMenu();
        pack();
        setSize(400,400);                    // Fixe la taille par défaut
        setVisible(true);                                // Affiche la fenetre
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Gestion de la fermeture
    }


    public void initAtribut() {
        button1 = new JButton("Solo");
        button2 = new JButton("2 joueurs");
        button3 = new JButton("3 joueurs");
        button4 = new JButton("4 joueurs");

        panelButton = new JPanel();
    }

    public void creerMenu() {

    }

    public void creerInterface() {

    }
}
