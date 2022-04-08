import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessreiheAnzahlZwischen2Test {
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
        Assert.assertTrue(this.m33244 + " hat zwischen 2 und 4 genau 5 Werte"
                    + " berechnet wurde " +  this.m33244.anzahlZwischen2(2,4)
                , this.m33244.anzahlZwischen2(2,4) == 5);
    }    

    @Test
    public void test02(){
        Assert.assertTrue(this.m53532 + " hat zwischen 5 und 5 genau 2 Werte"
                    + " berechnet wurde " +  this.m53532.anzahlZwischen2(5,5)
                , this.m53532.anzahlZwischen2(5,5) == 2);
    }    

    @Test
    public void test03(){
        Assert.assertTrue(this.m2344 + " hat zwischen 5 und 4 genau 0 Werte"
                    + " berechnet wurde " +  this.m2344.anzahlZwischen2(5,4)
                , this.m2344.anzahlZwischen2(5,4) == 0);
    }     

    @Test
    public void test04(){
        Assert.assertTrue(this.leer + " hat zwischen 0 und 9 genau 0 Werte"
                    + " berechnet wurde " +  this.leer.anzahlZwischen2(0,9)
                , this.leer.anzahlZwischen2(0,9) == 0);
    } 

    @Test
    public void test05(){
        Assert.assertTrue(this.mitNullListe + " hat zwischen 1 und 5 genau 0 Werte"
                    + " berechnet wurde " +  this.mitNullListe.anzahlZwischen2(1,5)
                , this.mitNullListe.anzahlZwischen2(1,5) == 0);
    }
}
