public class CarteRecompense {
    public int[/*quel element*/][/*nombre de points de prestige*/] recompense;

    public CarteRecompense(){
        this.recompense = new int[6][1];
    }

    public CarteRecompense(CarteRecompense recompense){
        this.recompense = new int[6][1];
    }
    public String litRecompense(){
        String recompense="";
        for(int i=0 ; i<5 ; i++){
            if(this.recompense[i][0]!=0){
                switch (i){
                    case 0:
                        //temple
                        recompense+=this.recompense[i][0]+" temple / ";
                    case 1:
                        //port
                        recompense+=this.recompense[i][0]+" port / ";
                    case 2:
                        //lotus
                        recompense+=this.recompense[i][0]+" lotus / ";
                    case 3:
                        //dragon
                        recompense+=this.recompense[i][0]+" dragon / ";
                    case 4:
                        //arka
                        recompense+=this.recompense[i][0]+" arka / ";
                }
            }
        }
        return recompense;
    }
}
