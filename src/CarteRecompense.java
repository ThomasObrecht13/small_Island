public class CarteRecompense {
    public int[/*quel element*/][/*nombre de points de prestige*/] recompense;

    public CarteRecompense(){
        this.recompense = new int[6][1];
    }

    public CarteRecompense(CarteRecompense recompense){
        this.recompense = new int[6][1];
    }
    public CarteRecompense(int temple, int port, int lotus, int dragon, int arka, int emplacementVide){
        this.recompense = new int[6][1];
        recompense[0][0]=temple;
        recompense[1][0]=port;
        recompense[2][0]=lotus;
        recompense[3][0]=dragon;
        recompense[4][0]=arka;
        recompense[5][0]=emplacementVide;
    }

    public String lectureRecompense(){
        String recompense="";
        for(int i=0 ; i<6 ; i++){
            if(this.recompense[i][0]!=0){
                switch (i){
                    case 0:
                        //temple
                        recompense+=this.recompense[i][0]+" temple ";
                        break;
                    case 1:
                        //port
                        recompense+=this.recompense[i][0]+" port ";
                        break;
                    case 2:
                        //lotus
                        recompense+=this.recompense[i][0]+" lotus ";
                        break;
                    case 3:
                        //dragon
                        recompense+=this.recompense[i][0]+" dragon ";
                        break;
                    case 4:
                        //arka
                        recompense+=this.recompense[i][0]+" arka ";
                        break;
                    case 5:
                        //emplacement vide
                        recompense+=this.recompense[i][0]+" emplacement vide ";
                        break;
                }
                if(i!=5){
                    recompense+="/ ";
                }
            }
        }
        return recompense;
    }
}
