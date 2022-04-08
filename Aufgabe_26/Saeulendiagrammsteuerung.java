public class Saeulendiagrammsteuerung {
    private Saeulendiagramm saeulenDiagramm = new Saeulendiagramm();
    private EinUndAusgabe io = new EinUndAusgabe();

    public void Saeulendiagrammsteuerung() {
        int eingabe = 1;
        while(eingabe != 0){
            io.ausgeben("\t0 - Programm beenden\n");
            io.ausgeben("\t1 - Saeule hinzufuegen\n");
            io.ausgeben("\t2 - Saeule loeschen\n");
            io.ausgeben("\t3 - Saeulen sortieren\n\t");
            eingabe = io.leseInteger();
            switch(eingabe){
                case 0 : 
                    io.ausgeben("\tInteraktionsbrett schliessen");
                    break;

                case 1: 
                    io.ausgeben("\tneuer Titel: ");
                    String titel = io.leseString();
                    io.ausgeben("\tWert: ");
                    int wert = io.leseInteger();
                    saeulenDiagramm.saeuleHinzufuegen(titel, wert);
                    break;

                case 2:
                    io.ausgeben("\tzu loeschender Titel: ");
                    String name = io.leseString();
                    saeulenDiagramm.saeuleLoeschen(name);
                    break;

                case 3: 
                    io.ausgeben("\tSaeulen wurden sortiert.\n");
                    saeulenDiagramm.sortieren();
                    break;

                default:
                    io.ausgeben("\tGeben Sie was richtiges ein\n");
                    break;
            }
        }
    }
}