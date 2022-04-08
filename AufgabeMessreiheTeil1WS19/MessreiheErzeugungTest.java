import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class MessreiheErzeugungTest {
    
    @Test
    public void testMessreiheMitOrtErzeugen(){
        Messreihe m = new Messreihe("Ort");
        Assert.assertTrue("Konstruktor sollte leere Messwertliste erzeugen"
            , m.getMesswerte().isEmpty());   
        Assert.assertTrue("Konstruktor sollte Messort \"Ort\" sich merken. gefunden wurde "
                + m.getMessort()
            , m.getMessort().equals("Ort"));    
    }

    @Test
    public void testMessreiheOhneOrtErzeugen(){
        Messreihe m = new Messreihe();
        Assert.assertTrue("Konstruktor sollte leere Messwertliste erzeugen"
            , m.getMesswerte().isEmpty());       
    }
    
    @Test 
    public void testGetSetMessort(){
        Messreihe m = new Messreihe();
        m.setMessort("Ort");
        Assert.assertTrue("setMessort sollte Messort \"Ort\" sich merken. gefunden wurde "
                + m.getMessort()
            , m.getMessort().equals("Ort"));    
    }
    
    @Test 
    public void testGetSetMesswerte(){
        Messreihe m = new Messreihe();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        m.setMesswerte(tmp);
        Assert.assertTrue("setMesswerte sollte sich leere Liste merken. gefunden wurde "
                + m.getMesswerte()
            , m.getMesswerte() == tmp);     // soll identisch (Referenz) sein
    }
}
