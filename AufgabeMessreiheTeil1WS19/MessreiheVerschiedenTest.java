import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MessreiheVerschiedenTest{
    
    private Messreihe m33244;
    private Messreihe m1555;
    private Messreihe m41;
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
        this.m1555 = new Messreihe("Ort2");
        this.m1555.hinzufuegen(1);
        this.m1555.hinzufuegen(5);
        this.m1555.hinzufuegen(5);
        this.m1555.hinzufuegen(5);
        this.m41 = new Messreihe("Ort3");
        this.m41.hinzufuegen(4);
        this.m41.hinzufuegen(1);
        this.leer = new Messreihe("Ort4");
        this.mitNullListe = new Messreihe("Ort5");
        this.mitNullListe.setMesswerte(null);
    }

    @Test
    public void test01(){
        Assert.assertTrue(this.m33244 + " und " + this.m1555 + " sind verschieden"
                , this.m33244.verschieden(this.m1555));
    }

    @Test
    public void test02(){
        Assert.assertTrue(this.m33244 + " und " + this.m41 + " sind nicht verschieden"
                ,!this.m33244.verschieden(this.m41));
    }
    
    @Test
    public void test03(){
        Assert.assertTrue(this.m33244 + " und " + this.leer + " sind verschieden"
                , this.m33244.verschieden(this.leer));
    }
    
    @Test
    public void test04(){
        Assert.assertTrue(this.m33244 + " und " + this.m33244 + " sind nicht verschieden"
                , !this.m33244.verschieden(this.m33244));
    }
 
    @Test
    public void test05(){
        Assert.assertTrue(this.m1555 + " und " + this.m1555 + " sind nicht verschieden"
                , !this.m1555.verschieden(this.m1555));
    }

    @Test
    public void test06(){
        Assert.assertTrue(this.m1555 + " und " + this.m41 + " sind nicht verschieden"
                ,!this.m1555.verschieden(this.m41));
    }
    
    @Test
    public void test07(){
        Assert.assertTrue(this.m1555 + " und " + this.leer + " sind verschieden"
                , this.m1555.verschieden(this.leer));
    }
    
    @Test
    public void test08(){
        Assert.assertTrue(this.m1555 + " und " + this.m33244 + " sind verschieden"
                , this.m1555.verschieden(this.m33244));
    }    

    @Test
    public void test09(){
        Assert.assertTrue(this.m41 + " und " + this.m1555 + " sind nicht verschieden"
                , !this.m41.verschieden(this.m1555));
    }

    @Test
    public void test10(){
        Assert.assertTrue(this.m41 + " und " + this.m41 + " sind nicht verschieden"
                ,!this.m41.verschieden(this.m41));
    }
    
    @Test
    public void test11(){
        Assert.assertTrue(this.m41 + " und " + this.leer + " sind verschieden"
                , this.m41.verschieden(this.leer));
    }
    
    @Test
    public void test12(){
        Assert.assertTrue(this.m41 + " und " + this.m33244 + " sind nicht verschieden"
                , !this.m41.verschieden(this.m33244));
    }     
    
     @Test
    public void test13(){
        Assert.assertTrue(this.leer + " und " + this.m1555 + " sind verschieden"
                , this.leer.verschieden(this.m1555));
    }

    @Test
    public void test14(){
        Assert.assertTrue(this.leer + " und " + this.m41 + " sind verschieden"
                ,this.leer.verschieden(this.m41));
    }
    
    @Test
    public void test15(){
        Assert.assertTrue(this.leer + " und " + this.leer + " sind verschieden"
                , this.leer.verschieden(this.leer));
    }
    
    @Test
    public void test16(){
        Assert.assertTrue(this.leer + " und " + this.m33244 + " sind verschieden"
                , this.leer.verschieden(this.m33244));
    }    
 
    @Test
    public void test17(){
        Assert.assertTrue(this.mitNullListe + " und " + this.leer + " sind verschieden"
                , this.mitNullListe.verschieden(this.m33244));
    }
    
    @Test
    public void test18(){
        Assert.assertTrue(this.mitNullListe + " und " + this.leer + " sind verschieden"
                , this.mitNullListe.verschieden(this.leer));
    }   
    
    @Test
    public void test19(){
        Assert.assertTrue(this.mitNullListe + " und " + this.mitNullListe + " sind verschieden"
                , this.mitNullListe.verschieden(this.mitNullListe));
    }    
    
    @Test
    public void test20(){
        Assert.assertTrue(this.m33244 + " und " + this.mitNullListe + " sind verschieden"
                , this.m33244.verschieden(this.mitNullListe));
    }     
}
