import org.junit.Assert;
import org.junit.Test;

public class CarteObjectifUnitTest {
    @Test
    public void lectureCarteMissionTest(){
        CarteMission mission = new CarteMission(1,503,40,17,2);
        Assert.assertEquals("1 temple / 503 port / 40 lotus / 17 dragon / 2 arka ",mission.lectureMission());
    }

    @Test
    public void lectureCarteRecomenseTest(){
        CarteRecompense recompense = new CarteRecompense(2,333,12,22,10,4,2);
        Assert.assertEquals("2 temple / 333 port / 12 lotus / 22 dragon / 10 arka / 4 emplacement vide / 2 bonus ",recompense.lectureRecompense());
    }

    @Test
    public void lectureCarteObjectifTest(){
        CarteMission mission = new CarteMission(1,503,40,17,2);
        CarteRecompense recompense = new CarteRecompense(2,333,12,22,10,4,2);
        CarteObjectif objectif = new CarteObjectif(mission,recompense);
        Assert.assertEquals("Objetif : 1 temple / 503 port / 40 lotus / 17 dragon / 2 arka // Récompense : 2 temple / 333 port / 12 lotus / 22 dragon / 10 arka / 4 emplacement vide / 2 bonus ",objectif.lectureCarteObjectif());
    }
}
