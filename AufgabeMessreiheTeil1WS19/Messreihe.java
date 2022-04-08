import java.util.*;
import java.util.Iterator;

public class Messreihe {
    private String messort;
    private ArrayList<Integer> liste;
    public Messreihe(){//Konstruktor erzeugt leere ArrayList
        this.liste = new ArrayList<Integer>();
    }

    public Messreihe(String messort){//Konstruktor mit Parameterliste(String Messort) 
        this.messort = messort;
        this.liste = new ArrayList<Integer>();
    }

    public void setMessort(String messort){
        this.messort = messort;
    }

    public void setMesswerte(ArrayList liste){
        this.liste = liste;
    }

    public String getMessort(){
        return this.messort;
    }

    public ArrayList getMesswerte(){
        return this.liste;
    }

    public void hinzufuegen(int messwert){//fuegt messwerte in die Liste ein
        liste.add(messwert);
    }

    public int min(){
        if(this.liste==null){//ueberpruefung nach leerer Liste dann return 0
            return 0;
        }
        int zaehler=0;
        int min=0;
        while(zaehler < this.liste.size()){//ueberpruefung der gesamten Liste
            if(this.liste.get(zaehler)<min||min==0){//min wird nur bei der Bedingung geaendert
                min=this.liste.get(zaehler);
            }
            zaehler++;
        }
        return min;
    }

    public double durchschnitt(){
        if(this.liste==null){
            return 0.0;
        }
        if (this.liste.isEmpty()){
            return 0.0;
        }
        int zaehler =0;
        double summe=0;
        while(zaehler < this.liste.size()){
            summe = this.liste.get(zaehler)+summe;//addiert alle Werte der Liste
            zaehler++;
        }
        return summe/this.liste.size()*1.0;//berechnet aus der summe aller Werte und der laenge der Liste den Schnitt
    }

    // public int anzahlZwischen(int min, int max){
        // int zaehler=0;
        // int summe=0;
        // if(this.liste==null){
            // return 0;
        // }
        // while(zaehler <this.liste.size()){
            // if(min<=this.liste.get(zaehler) && max>=this.liste.get(zaehler)){
                // summe++;//alle Einraege der Liste werden ueberpreuft, ob sie in dem Bereich liegen
                // //gilt die Bedingung wird die Summe um 1 erhoeht
            // }
            // zaehler++;
        // }
        // return summe;
    // }

    public int anzahlZwischen2(int min, int max){
        int summe=0;
        if(this.liste==null){
            return 0;
        }

        for(int zaehler = 0; zaehler < this.liste.size(); zaehler = zaehler+1){
            if(min<=this.liste.get(zaehler)&& max >=this.liste.get(zaehler)){
                summe++;
            }
        }
        return summe;
    }

    public int anzahlZwischen3(int min, int max){
        int summe=0;
        int zaehler=0;
        if(this.liste==null){
            return 0;
        }

        for(int schleife:this.liste){
            if(min<=this.liste.get(zaehler)&&max>=this.liste.get(zaehler)){
                summe++;
            }
            zaehler++;
        }
        return summe;
    }

    public int anzahlZwischen4(int min, int max){//laeuft nicht
        int summe =0;
        if(this.liste == null){
            return 0;
        }
        Iterator<Integer> it = this.liste.iterator();
        //int wert=it.next();
        while(it.hasNext()){
            int wert=it.next();
            if(min<=wert&&max>=wert){
                summe++;
            }
        }
        return summe;
    }

    public boolean zweiGleiche(){
        int zaehler=0;
        int zaehler2=0;
        if(this.liste == null){
            return false;
        }
        while(zaehler < this.liste.size()){
            while(zaehler2 <this.liste.size()){
                if(this.liste.get(zaehler)==this.liste.get(zaehler2) ){
                    if(zaehler!=zaehler2){
                        return true;
                    }//muss ungleich sein, da sonst Eintrag 1 = Eintrag 1 waere
                }
                zaehler2++;
            }
            zaehler2=0;
            zaehler++;
        }
        return false;
    }

    public boolean verschieden(Messreihe m){
        int zaehler=0;
        int zaehler2=0;
        if(this.liste == null && m.getMesswerte()!=null|| m.getMesswerte()==null&&this.liste!=null){
            return true;
        }//uebrprueft ob eine Liste von beiden Null ist
        if(this.liste == null && m.getMesswerte()==null){
            return true;
        }//laut Test null und null sind verschieden (Test19)
        while (zaehler< this.liste.size()){
            while (zaehler2 < m.getMesswerte().size()){
                if(this.liste.get(zaehler) == m.getMesswerte().get(zaehler2)){
                    return false;
                }//wenn das gleich ist soll return false ausgefuehrt werden
                zaehler2++;
            }
            zaehler2=0;
            zaehler++;
        }
        return true;
    }

    private int anzahlWert(int wert){
        int zaehler=0;
        int summe =0;
        while(zaehler < this.liste.size()){
            if(this.liste.get(zaehler) == wert)
            {
                summe++;
            }
            zaehler++;
        }
        return summe;
    }

    public boolean alleWerteGleichOft(Messreihe m){//laeuft nicht
        // eigentlich einfach die listen Sortieren und dann vergleichen

        int zaehler=0;

        if(this.liste == null && m.getMesswerte()!=null|| m.getMesswerte()==null&&this.liste!=null){
            return true;
        }
        if(this.liste == null && m.getMesswerte()==null){
            return true;

        }
        return false;
        // int a=1;
        // for(int k=1; k<liste.size();k++){
        // for(int b=0; b<(this.liste.size()-k);b++){
        // if(this.liste.get(b)>liste.get(b+1)){
        // a=liste.get(b);
        // liste.set(b,liste.get (b+1));
        // liste.set(b+1,a);

        // }
        // }
        // }

    }

    public void arraysortieren(){ 
        int a=1;
        for(int k=1; k<liste.size();k++){
            for(int b=0; b<(this.liste.size()-k);b++){
                if(this.liste.get(b)>liste.get(b+1)){
                    a=liste.get(b);
                    liste.set(b,liste.get (b+1));
                    liste.set(b+1,a);

                }
            }
        }
    }

    // int a=1;
    // for(int k=1; k<liste.size();k++){
    // for(int b=0; b<(this.liste.size()-k);b++){
    // if(this.liste.get(b)>liste.get(b+1)){
    // a=liste.get(b);
    // liste.set(b,liste.get (b+1));
    // liste.set(b+1,a);

    // }
    // }
    // }
    // }
    //while (zaehler){}

    // while (zaehler<2){
    // Collections.sort(this.liste.get(zaehler));
    // }

    // int zaehler=0;
    // if(this.liste == null && m.getMesswerte()!=null|| m.getMesswerte()==null&&this.liste!=null){
    // return false;
    // }
    // if(this.liste == null && m.getMesswerte()==null){
    // return false;
    // }
    // (zaehler < this.liste.size()){
    // Collections.sort(liste.get(zaehler));
    // zaehler++;
    // }
    // if (vergleich){
    // return true;
    // }

    // int zaehler =0;
    // while (zaehler < this.liste.size()){
    // if(anzahlWert(m.getMesswerte().get(zaehler))==0)
    // {
    // return false;
    // }
    //return false;
    // zaehler++;
    // }

    public boolean gleicheWerte(Messreihe m){//laeuft nicht
        //listen sortieren, gleiche werte löschen dann vergleichen = true
        int zaehler=0;
        int zaehler2=0;
        if(this.liste == null && m.getMesswerte()!=null|| m.getMesswerte()==null&&this.liste!=null){
            return false;
        }
        if(this.liste == null && m.getMesswerte()==null){
            return false;
        }
        while (zaehler< this.liste.size()){
            while (zaehler2 < m.getMesswerte().size()){
                if(this.liste.get(zaehler) == m.getMesswerte().get(zaehler2)){
                    return true;
                }
                zaehler2++;
            }
            zaehler2=0;
            zaehler++;
        }

        return false;
    }
}