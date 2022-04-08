import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/* Anders als die anderen Klassen in diesem Projekt, muss dies nicht
 * verstanden werden. Sie dient ausschliesslich der Bequemlichkeit,
 * alle Tests nacheinander zusammen auszufuehren. Laufen alle Tests,
 * wird einfach "true" ausgegeben.
 * Klasse wurde ergaenzt, da BlueJ kann TestSuites unterstuetzt (?).
 */

@RunWith(Suite.class)
@SuiteClasses({ MessreiheErzeugungTest.class
    , MessreiheMinTest.class, MessreiheDurchschnittTest.class
    , MessreiheAnzahlZwischenTest.class, MessreiheAnzahlZwischen2Test.class
    , MessreiheAnzahlZwischen3Test.class, MessreiheAnzahlZwischen4Test.class
    , MessreiheZweiGleicheTest.class, MessreiheVerschiedenTest.class
    , MessreiheAlleWerteGleichOftTest.class, MessreiheGleicheWerteTest.class})
public class AllTest {
    
   public static void executeAllTests() {    
      Result result = JUnitCore.runClasses(AllTest.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}