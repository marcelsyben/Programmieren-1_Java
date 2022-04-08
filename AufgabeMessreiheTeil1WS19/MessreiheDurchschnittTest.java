import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessreiheDurchschnittTest
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
        Assert.assertTrue(this.m33244 + " hat Durchschnitt 3.2"
                    + " berechnet wurde " +  this.m33244.durchschnitt()
                , this.m33244.durchschnitt() == 3.2);
    }    

    @Test
    public void test02(){
        Assert.assertTrue(this.m53532 + " hat Durchschnitt 3.6"
                    + " berechnet wurde " +  this.m53532.durchschnitt()
                , this.m53532.durchschnitt() == 3.6);
    }    

    @Test
    public void test03(){
        Assert.assertTrue(this.m2344 + " hat Durchschnitt 3.25"
                    + " berechnet wurde " +  this.m2344.durchschnitt()
                , this.m2344.durchschnitt() == 3.25);
    }     

    @Test
    public void test04(){
        Assert.assertTrue(this.leer + " hat Durchschnitt 0"
                    + " berechnet wurde " +  this.leer.durchschnitt()
                , this.leer.durchschnitt() == 0);
    } 

    @Test
    public void test05(){
        Assert.assertTrue(this.mitNullListe + " hat Durchschnitt 0"
                    + " berechnet wurde " +  this.mitNullListe.durchschnitt()
                , this.mitNullListe.durchschnitt() == 0);
    }
}
