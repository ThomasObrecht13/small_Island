import java.util.List;

public class Carte {
    private int[/*quel element*/][/*nombre d'element*/] objectif;
    private int[][] recompense;

    public Carte(){
        this.objectif=new int[5][1];    //5 elements max
        this.recompense=new int[6][1];  //5 elements max + 1 bonus => 6
    }

    public Carte(int[][] objectif, int[][] recompense){
        super();
        for(int i=0 ; i<5 ; i++){
            this.objectif[i][0]=objectif[i][0];
            this.recompense[i][0]=recompense[i][0];
        }
        this.recompense[5][0]=recompense[5][0];
    }

    public int[][] getObjectif(){
        return this.objectif;
    }
    public int[][] getRecompense(){
        return this.recompense;
    }

    public int getPoint(){
        int result=0;
        for(int i=0 ; i<5 ; i++) {
            result += this.recompense[i][0]/* x nb element*/;
        }
        return result;
    }

    /*
    public String afficheObjectif(){
        String objectif="";
        for(int i=0 ; i<4 ; i++){
            if(this.objectif[i][0]!=0){
                switch (i){
                    case 0:
                        //temple
                        result+=this..objectif[i][0]+" temple / ";
                    case 1:
                        //port
                        result+=this..objectif[i][0]+" port / ";
                    case 2:
                        //lotus
                        result+=this..objectif[i][0]+" lotus / ";
                    case 3:
                        //dragon
                        result+=this..objectif[i][0]+" dragon / ";
                    case 4:
                        //arka
                        result+=this..objectif[i][0]+" arka / ";
                }
            }
        }
        return objectif;
    }
    */
}
