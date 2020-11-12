public class CarteMission {
    protected int[/*quel element*/][/*nombre d'element*/] mission;

    public CarteMission(){
        this.mission = new int[5][1];
    }
    public CarteMission(CarteMission mission){
        this.mission = new int[5][1];
    }
    public CarteMission(int temple, int port, int lotus, int dragon, int arka){
        this.mission = new int[5][1];
        mission[0][0]=temple;
        mission[1][0]=port;
        mission[2][0]=lotus;
        mission[3][0]=dragon;
        mission[4][0]=arka;
    }

    public String lectureMission() {
        String mission = "";
        for (int i = 0; i < 5; i++) {
            if (this.mission[i][0] != 0) {
                switch (i) {
                    case 0:
                        //temple
                        mission += this.mission[i][0] + " temple ";
                        break;
                    case 1:
                        //port
                        mission += this.mission[i][0] + " port ";
                        break;
                    case 2:
                        //lotus
                        mission += this.mission[i][0] + " lotus ";
                        break;
                    case 3:
                        //dragon
                        mission += this.mission[i][0] + " dragon ";
                        break;
                    case 4:
                        //arka
                        mission += this.mission[i][0] + " arka ";
                        break;
                }
                if(i!=4){
                    mission+="/ ";
                }
            }
        }
        return mission;
    }
}
