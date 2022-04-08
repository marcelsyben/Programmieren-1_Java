import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MessreiheMinTest {

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
    public void test01MinInDerMitte(){
        Assert.assertTrue(this.m33244 + " hat Minimum 2"
                    + " berechnet wurde " +  this.m33244.min()
                , this.m33244.min() == 2);
    }    

    @Test
    public void test02MinAmEnde(){
        Assert.assertTrue(this.m53532 + " hat Minimum 2"
                    + " berechnet wurde " +  this.m53532.min()
                , this.m53532.min() == 2);
    }    

    @Test
    public void test03MinAmAnfang(){
        Assert.assertTrue(this.m2344 + " hat Minimum 2"
                    + " berechnet wurde " +  this.m2344.min()
                , this.m2344.min() == 2);
    }     

    @Test
    public void test04MinLeereListe(){
        Assert.assertTrue(this.leer + " hat Minimum 0"
                    + " berechnet wurde " +  this.leer.min()
                , this.leer.min() == 0);
    } 

    @Test
    public void test05MinNullListe(){
        Assert.assertTrue(this.mitNullListe + " hat Minimum 0"
                    + " berechnet wurde " +  this.mitNullListe.min()
                , this.mitNullListe.min() == 0);
    }
}
