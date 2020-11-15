public class CarteObjectif extends Carte{
    CarteMission mission;
    CarteRecompense recompense;

    public CarteObjectif(){
        mission=new CarteMission(mission);
        recompense= new CarteRecompense(recompense);
    }

    public CarteObjectif(CarteMission mission, CarteRecompense recompense){
        this.mission=mission;
        this.recompense= recompense;
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

    public String LectureMission(){
        return mission.lectureMission();
    }

    public String lectureRecompense(){
        return recompense.lectureRecompense();
    }

    public String lectureCarteObjectif(){
        return "Objetif : "+mission.lectureMission()+"// Récompense : "+recompense.lectureRecompense();
    }

}
