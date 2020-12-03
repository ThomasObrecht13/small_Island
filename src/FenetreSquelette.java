import javax.swing.*;
import java.awt.*;

public class FenetreSquelette extends JFrame {
    JPanel fenGlobal;
    JPanel pioche;
    JPanel plateau;
    JPanel bateau_nav_pay;
    JPanel milieu;
    JPanel cartejoueur;
    GridBagConstraints grid;

    JButton piocheNavigation;
    JButton piochReserve;

    JButton bateau1;
    JButton bateau2;
    JButton bateau3;
    JButton bateau4;

    JButton tuileNav;
    JButton tuilePay1;
    JButton tuilePay2;
    JButton tuilePay3;

    JButton BcarteJoueur;

    JButton[] tabPlateau;

    public FenetreSquelette() {
        initAtribut();
        creerInterface();
        creerBouton();
        pack();
        setSize(1400,700);                    // Fixe la taille par défaut
        setVisible(true);                                // Affiche la fenetre
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Gestion de la fermeture
    }
    public void initAtribut(){
        //JPanel
        fenGlobal = new JPanel(new GridBagLayout());
        grid = new GridBagConstraints();
        pioche = new JPanel();
        bateau_nav_pay= new JPanel(new GridLayout(2,4));
        plateau = new JPanel(new GridLayout(7, 8));
        milieu = new JPanel();

        cartejoueur = new JPanel();
        cartejoueur.setBackground(Color.BLACK);
        cartejoueur.setPreferredSize(new Dimension(150,150));

        //Plateau
        tabPlateau = new JButton[56];
        for(int i=0 ; i<56 ; i++){
            tabPlateau[i] = new JButton();
            tabPlateau[i].setPreferredSize(new Dimension(70,70));

        }

        //Bouton
        piocheNavigation = new JButton("pioche \nNavigation");
        piocheNavigation.setPreferredSize(new Dimension(150,100));
        piocheNavigation.setBackground(Color.ORANGE);

        piochReserve= new JButton("pioche \nReserve");
        piochReserve.setPreferredSize(new Dimension(150,100));
        piochReserve.setBackground(Color.RED);

        bateau1 = new JButton("bateau1");
        bateau2 = new JButton("bateau2");
        bateau3 = new JButton("bateau3");
        bateau4 = new JButton("bateau4");
        bateau1.setPreferredSize(new Dimension(70,70));
        bateau2.setPreferredSize(new Dimension(70,70));
        bateau3.setPreferredSize(new Dimension(70,70));
        bateau4.setPreferredSize(new Dimension(70,70));

        tuileNav = new JButton();
        tuilePay1 = new JButton();
        tuilePay2 = new JButton();
        tuilePay3 = new JButton();
        tuileNav.setPreferredSize(new Dimension(70,70));
        tuilePay1.setPreferredSize(new Dimension(70,70));
        tuilePay2.setPreferredSize(new Dimension(70,70));
        tuilePay3.setPreferredSize(new Dimension(70,70));

        BcarteJoueur = new JButton("afficher carte Joueur");
        BcarteJoueur.setPreferredSize(new Dimension(200,100));

    }

    public void creerInterface(){
        for(int i=0 ; i<56 ; i++){
            plateau.add(tabPlateau[i]);
        }
        bateau_nav_pay.add(bateau1);
        bateau_nav_pay.add(bateau2);
        bateau_nav_pay.add(bateau3);
        bateau_nav_pay.add(bateau4);
        bateau_nav_pay.add(tuileNav);
        bateau_nav_pay.add(tuilePay1);
        bateau_nav_pay.add(tuilePay2);
        bateau_nav_pay.add(tuilePay3);


        pioche.add(piochReserve);
        pioche.add(piocheNavigation);

        grid.gridx=0;
        grid.gridy=0;
        fenGlobal.add(pioche,grid);

        grid.gridx=1;
        grid.gridy=0;
        grid.weighty=0.5;
        fenGlobal.add(bateau_nav_pay,grid);

        grid.gridx=1;
        grid.gridy=1;
        fenGlobal.add(plateau,grid);

        grid.gridx=3;
        grid.gridy=0;
        grid.weightx=0.5;
        fenGlobal.add(BcarteJoueur,grid);

        grid.gridx=3;
        grid.gridy=1;
        fenGlobal.add(cartejoueur,grid);

        setContentPane(fenGlobal);
    }
    public void creerBouton(){
        /*
        for(int i=0 ; i<56 ; i++) {
            tabPlateau[i].addActionListener();
        }
        piocheNavigation.addActionListener();
        bateau.addActionListener();
        carteJoueur.addActionListener();
        */
    }
}
