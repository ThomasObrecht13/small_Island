public class CarteObjectif {
    CarteMission mission;
    CarteRecompense recompense;

    public CarteObjectif(){
        mission=new CarteMission(mission);
        recompense= new CarteRecompense(recompense);
    }

    public CarteObjectif(CarteMission mission, CarteRecompense recompense){
        this.mission=new CarteMission(mission);
        this.recompense= new CarteRecompense(recompense);
    }

    public CarteMission getMission(){
        return mission;
    }
    public CarteRecompense getRecompense(){
        return recompense;
    }

    public int getPoint(){
        int result=0;
        for(int i=0 ; i<5 ; i++) {
            result += recompense.recompense[i][0]/* x nb element*/;
        }
        return result;
    }

    public String litObjectif(){
        return mission.litMission();
    }

    public String litRecompense(){
        return recompense.litRecompense();
    }

}
