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
        CarteRecompense recompense = new CarteRecompense(2,333,12,22,10,4);
        Assert.assertEquals("2 temple / 333 port / 12 lotus / 22 dragon / 10 arka / 4 emplacement vide ",recompense.lectureRecompense());
    }
}
