public class CarteMission {
    protected int[/*quel element*/][/*nombre d'element*/] mission;

    public CarteMission(){
        this.mission = new int[5][1];
    }
    public CarteMission(CarteMission mission){
        this.mission = new int[5][1];
    }

    public String litMission() {
        String mission = "";
        for (int i = 0; i < 5; i++) {
            if (this.mission[i][0] != 0) {
                switch (i) {
                    case 0:
                        //temple
                        mission += this.mission[i][0] + " temple / ";
                    case 1:
                        //port
                        mission += this.mission[i][0] + " port / ";
                    case 2:
                        //lotus
                        mission += this.mission[i][0] + " lotus / ";
                    case 3:
                        //dragon
                        mission += this.mission[i][0] + " dragon / ";
                    case 4:
                        //arka
                        mission += this.mission[i][0] + " arka / ";
                }
            }
        }
        return mission;
    }
}
