import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessreiheZweiGleicheTest
{
    private Messreihe m33244;
    private Messreihe m53532;
    private Messreihe m2344;
    private Messreihe leer;
    private Messreihe mitNullListe;
    
    @Before
    public void setUp(){
        this.m33244 = new Messreihe("Ort1");
        this.m33244.hinzufuegen(3);
        this.m33244.hinzufuegen(3);
        this.m33244.hinzufuegen(2);
        this.m33244.hinzufuegen(4);
        this.m33244.hinzufuegen(4);
        this.m53532 = new Messreihe("Ort2");
        this.m53532.hinzufuegen(5);
        this.m53532.hinzufuegen(3);
        this.m53532.hinzufuegen(5);
        this.m53532.hinzufuegen(3);
        this.m53532.hinzufuegen(2);
        this.m2344 = new Messreihe("Ort3");
        this.m2344.hinzufuegen(2);
        this.m2344.hinzufuegen(3);
        this.m2344.hinzufuegen(4);
        this.m2344.hinzufuegen(4);   
        this.leer = new Messreihe("Ort4");
        this.mitNullListe = new Messreihe("Ort5");
        this.mitNullListe.setMesswerte(null);
    }

    @Test
    public void test01(){
        Assert.assertTrue(this.m33244 + " hat aber zwei Gleiche"
                , this.m33244.zweiGleiche());
    }    

    @Test
    public void test02(){
        Assert.assertTrue(this.m53532 + " hat aber zwei Gleiche"
                    + " berechnet wurde " +  this.m53532.zweiGleiche()
                , this.m53532.zweiGleiche());
    }    

    @Test
    public void test03(){
        Assert.assertTrue(this.m2344 + " hat aber zwei Gleiche"
                    + " berechnet wurde " +  this.m2344.zweiGleiche()
                , this.m2344.zweiGleiche());
    }     

    @Test
    public void test04(){
        Assert.assertTrue(this.leer + " hat keine zwei Gleiche"
                , !this.leer.zweiGleiche());
    } 

    @Test
    public void test05(){
        Assert.assertTrue(this.mitNullListe + " hat keine zwei Gleichen"
                , !this.leer.zweiGleiche());
    }
    
    @Test
    public void test06(){
        Messreihe m = new Messreihe("Alles in einem Test");
        m.hinzufuegen(42);
        Assert.assertTrue(m + " hat keine zwei Gleichen"
                , !m.zweiGleiche());
    } 
    
    @Test
    public void test07(){
        Messreihe m = new Messreihe("Alles in einem Test");
        for (int i=0; i<10000; i++) {
            m.hinzufuegen(i);
        }
        Assert.assertTrue("List von 0 bis 9999 hat keine zwei Gleichen"
                , !m.zweiGleiche());
    }     
}
