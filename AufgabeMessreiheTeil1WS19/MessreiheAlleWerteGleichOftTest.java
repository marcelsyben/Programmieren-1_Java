import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MessreiheAlleWerteGleichOftTest{
    
    private Messreihe m33244;
    private Messreihe m43243;
    private Messreihe m2344;
    private Messreihe m432432;
    private Messreihe m332445;
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
        this.m43243 = new Messreihe("Ort2");
        this.m43243.hinzufuegen(4);
        this.m43243.hinzufuegen(3);
        this.m43243.hinzufuegen(2);
        this.m43243.hinzufuegen(4);
        this.m43243.hinzufuegen(3);
        this.m2344 = new Messreihe("Ort3");
        this.m2344.hinzufuegen(2);
        this.m2344.hinzufuegen(3);
        this.m2344.hinzufuegen(4);
        this.m2344.hinzufuegen(4);
        this.m432432 = new Messreihe("Ort22");
        this.m432432.hinzufuegen(4);
        this.m432432.hinzufuegen(3);
        this.m432432.hinzufuegen(2);
        this.m432432.hinzufuegen(4);
        this.m432432.hinzufuegen(3);
        this.m432432.hinzufuegen(2);
        this.m332445 = new Messreihe("Ort11");
        this.m332445.hinzufuegen(3);
        this.m332445.hinzufuegen(3);
        this.m332445.hinzufuegen(2);
        this.m332445.hinzufuegen(4);
        this.m332445.hinzufuegen(4);
        this.m332445.hinzufuegen(5);
        this.leer = new Messreihe("Ort4");
        this.mitNullListe = new Messreihe("Ort5");
        this.mitNullListe.setMesswerte(null);
    }

    @Test
    public void test01(){
        Assert.assertTrue(this.m33244 + " und " + this.m43243 + " haben die gleichen Werte"
                , this.m33244.alleWerteGleichOft(this.m43243));
    }

    @Test
    public void test02(){
        Assert.assertTrue(this.m33244 + " und " + this.m2344 + " haben nicht die gleichen Werte"
                ,!this.m33244.alleWerteGleichOft(this.m2344));
    }
    
    @Test
    public void test03(){
        Assert.assertTrue(this.m33244 + " und " + this.leer + " haben nicht die gleichen Werte"
                , !this.m33244.alleWerteGleichOft(this.leer));
    }
    
    @Test
    public void test04(){
        Assert.assertTrue(this.m33244 + " und " + this.m33244 + " haben die gleichen Werte"
                , this.m33244.alleWerteGleichOft(this.m33244));
    }
    
    @Test
    public void test05(){
        Assert.assertTrue(this.m33244 + " und " + this.m432432 + " haben nicht die gleichen Werte"
                , !this.m33244.alleWerteGleichOft(this.m432432));
    }    
 
    @Test
    public void test06(){
        Assert.assertTrue(this.m33244 + " und " + this.m332445 + " haben nicht die gleichen Werte"
                , !this.m33244.alleWerteGleichOft(this.m332445));
    }
    
    @Test
    public void test07(){
        Assert.assertTrue(this.m43243 + " und " + this.m33244 + " haben die gleichen Werte"
                , this.m43243.alleWerteGleichOft(this.m33244));
    }

    @Test
    public void test08(){
        Assert.assertTrue(this.m2344 + " und " + this.m43243 + " haben nicht die gleichen Werte"
                ,!this.m2344.alleWerteGleichOft(this.m43243));
    }
    
    @Test
    public void test09(){
        Assert.assertTrue(this.m432432 + " und " + this.m33244 + " haben nicht die gleichen Werte"
                , !this.m432432.alleWerteGleichOft(this.m33244));
    }
    
    @Test
    public void test10(){
        Assert.assertTrue(this.m332445 + " und " + this.m33244 + " haben nicht die gleichen Werte"
                , !this.m332445.alleWerteGleichOft(this.m33244));
    }    
    
    @Test
    public void test11(){
        Assert.assertTrue(this.leer + " und " + this.leer + " haben die gleichen Werte"
                , this.leer.alleWerteGleichOft(this.leer));
    }   
    
    @Test
    public void test12(){
        Assert.assertTrue(this.mitNullListe + " und " + this.m33244 + " haben nicht die gleichen Werte"
                , !this.mitNullListe.alleWerteGleichOft(this.m33244));
    }   
    
    @Test
    public void test13(){
        Assert.assertTrue(this.mitNullListe + " und " + this.leer + " haben die gleichen Werte"
                , this.mitNullListe.alleWerteGleichOft(this.leer));
    } 
    
    @Test
    public void test14(){
        Assert.assertTrue(this.mitNullListe + " und " + this.mitNullListe + " haben die gleichen Werte"
                , this.mitNullListe.alleWerteGleichOft(this.mitNullListe));
    }   
    
    @Test
    public void test15(){
        Assert.assertTrue(this.m33244 + " und " + this.mitNullListe + " haben nicht die gleichen Werte"
                , !this.m33244.alleWerteGleichOft(this.mitNullListe));
    }    
}
