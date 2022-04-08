import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MessreiheGleicheWerteTest{
    
    private Messreihe m33244;
    private Messreihe m43243;
    private Messreihe m234;
    private Messreihe m432432;
    private Messreihe m332445;
    private Messreihe m3;
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
        this.m234 = new Messreihe("Ort3");
        this.m234.hinzufuegen(2);
        this.m234.hinzufuegen(3);
        this.m234.hinzufuegen(4);
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
        this.m3 = new Messreihe("Ort12");
        this.m3.hinzufuegen(3);
        this.leer = new Messreihe("Ort4");
        this.mitNullListe = new Messreihe("Ort5");
        this.mitNullListe.setMesswerte(null);
    }

    @Test
    public void test01(){
        Assert.assertTrue(this.m33244 + " und " + this.m43243 + " enthalten die gleichen Werte"
                , this.m33244.gleicheWerte(this.m43243));
    }

    @Test
    public void test02(){
        Assert.assertTrue(this.m33244 + " und " + this.m234 + " enthalten die gleichen Werte"
                ,this.m33244.gleicheWerte(this.m234));
    }
    
    @Test
    public void test03(){
        Assert.assertTrue(this.m33244 + " und " + this.leer + " enthalten nicht die gleichen Werte"
                , !this.m33244.gleicheWerte(this.leer));
    }
    
    @Test
    public void test04(){
        Assert.assertTrue(this.m33244 + " und " + this.m33244 + " enthalten die gleichen Werte"
                , this.m33244.gleicheWerte(this.m33244));
    }
    
    @Test
    public void test05(){
        Assert.assertTrue(this.m33244 + " und " + this.m432432 + " enthalten die gleichen Werte"
                , this.m33244.gleicheWerte(this.m432432));
    }    
 
    @Test
    public void test06(){
        Assert.assertTrue(this.m33244 + " und " + this.m332445 + " enthalten nicht die gleichen Werte"
                , !this.m33244.gleicheWerte(this.m332445));
    }
    
    @Test
    public void test07(){
        Assert.assertTrue(this.m43243 + " und " + this.m33244 + " enthalten die gleichen Werte"
                , this.m43243.gleicheWerte(this.m33244));
    }

    @Test
    public void test08(){
        Assert.assertTrue(this.m234 + " und " + this.m43243 + " enthalten die gleichen Werte"
                ,this.m234.gleicheWerte(this.m43243));
    }
    
    @Test
    public void test09(){
        Assert.assertTrue(this.m432432 + " und " + this.m33244 + " enthalten die gleichen Werte"
                , this.m432432.gleicheWerte(this.m33244));
    }
    
    @Test
    public void test10(){
        Assert.assertTrue(this.m332445 + " und " + this.m33244 + " enthalten nicht die gleichen Werte"
                , !this.m332445.gleicheWerte(this.m33244));
    }    
    
    @Test
    public void test11(){
        Assert.assertTrue(this.leer + " und " + this.leer + " enthalten die gleichen Werte"
                , this.leer.gleicheWerte(this.leer));
    }  

    @Test
    public void test12(){
        Assert.assertTrue(this.m332445 + " und " + this.m3 + " enthalten nicht die gleichen Werte"
                , !this.m332445.gleicheWerte(this.m3));
    }
    
    @Test
    public void test13(){
        Assert.assertTrue(this.m3 + " und " + this.m33244 + " enthalten nicht die gleichen Werte"
                , !this.m3.gleicheWerte(this.m33244));
    }
    
    @Test
    public void test14(){
        Assert.assertTrue(this.m3 + " und " + this.m3 + " enthalten die gleichen Werte"
                , this.m3.gleicheWerte(this.m3));
    }  
    
    @Test
    public void test15(){
        Assert.assertTrue(this.mitNullListe + " und " + this.m3 + " enthalten nicht die gleichen Werte"
                , !this.mitNullListe.gleicheWerte(this.m3));
    }    
    
    @Test
    public void test16(){
        Assert.assertTrue(this.mitNullListe + " und " + this.leer + " enthalten die gleichen Werte"
                , this.mitNullListe.gleicheWerte(this.leer));
    }  
    
    @Test
    public void test17(){
        Assert.assertTrue(this.mitNullListe + " und " + this.mitNullListe + " enthalten die gleichen Werte"
                , this.mitNullListe.gleicheWerte(this.mitNullListe));
    }    
    
    @Test
    public void test18(){
        Assert.assertTrue(this.m3 + " und " + this.mitNullListe + " enthalten nicht die gleichen Werte"
                , !this.m3.gleicheWerte(this.mitNullListe));
    }    
}
