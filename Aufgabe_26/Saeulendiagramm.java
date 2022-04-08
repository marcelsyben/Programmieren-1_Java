import java.util.ArrayList;
import java.util.Iterator;

public class Saeulendiagramm {
    private ArrayList<Saeule> saeule = new ArrayList<Saeule>();
    private Interaktionsbrett ib = new Interaktionsbrett();
    private int kleinste;
    private int groesste;
    private int x;
    private int y;
    private double faktor;

    public Saeulendiagramm(){

    }

    public void saeuleHinzufuegen(String titel, int wert) {
        Saeule s = new Saeule();
        s.setTitel(titel);
        s.setWert(wert);
        saeule.add(s);
        zeichnen();
    }

    public void saeuleLoeschen(String name){
        int zaehler = 0;
        while(zaehler < saeule.size()){
            if(saeule.get(zaehler).getTitel().equals(name)){
                saeule.remove(saeule.get(zaehler));
            }
            zaehler++;
        }
        this.zeichnen();
    }

    public void zeichnen() {
        ib.abwischen();
        Iterator<Saeule> it = this.saeule.iterator();
        if(saeule.size() > 0){
            this.kleinste = saeule.get(0).getWert();
            this.groesste = saeule.get(0).getWert();
        }
        int zaehler = 0;
        int size = saeule.size();
        minMaxSaeulenWert();
        while(it.hasNext()) {
            ib.neueLinie(40,400,340,400);
            Saeule s = it.next();
            ib.neuerText(40+zaehler*(300/size),415,s.getTitel());
            ib.neuerText(0,40,"" + this.groesste);
            ib.neuerText(0,400,"" + this.kleinste);
            this.faktor = (1.0*(this.groesste-s.getWert())/this.groesste)*100;
            this.y = (int) faktor*370/100+30;
            this.x = 40+zaehler*(300/size);
            if(this.kleinste == this.groesste){
                ib.neuerText(this.x,20,"" + s.getWert());
                ib.neueLinie(this.x,30,40+(zaehler+1)*(300/size),30);
                ib.neueLinie(this.x,400,this.x,this.y);
                ib.neueLinie(340,30,340,400);
            } else if(this.kleinste != s.getWert()){
                ib.neuerText(this.x,20,"" + s.getWert());
                ib.neueLinie(this.x,this.y,40+(zaehler+1)*(300/size),this.y);
                ib.neueLinie(this.x,400,this.x,this.y);
                ib.neueLinie(40+(zaehler+1)*(300/size),400,40+(zaehler+1)*(300/size),this.y);
            } else{
                ib.neuerText(this.x,390,"" + s.getWert());
            }
            zaehler++;
        }
    }

    public void minMaxSaeulenWert() {
        Iterator<Saeule> it = this.saeule.iterator();
        while(it.hasNext()){
            Saeule s = it.next();
            if(s.getWert() < this.kleinste){
                this.kleinste = s.getWert();
            }
            if(s.getWert() > this.groesste){
                this.groesste = s.getWert();
            }
        }
    }

    public void sortieren(){
        int sortiertBis = 1;
        while (sortiertBis < this.saeule.size()) {
            Saeule sortiert = this.saeule.get(sortiertBis);
            int sortierenZahl = sortiert.getWert();            
            boolean abgeschlossen = false;
            int pos = sortiertBis - 1;
            while(!abgeschlossen){
                if(pos == -1 || this.saeule.get(pos).getWert() <= sortierenZahl) {
                    this.saeule.set(pos + 1, sortiert);
                    abgeschlossen = true;
                } else {
                    this.saeule.set(pos + 1, this.saeule.get(pos));
                }
                pos = pos - 1;
            }
            sortiertBis = sortiertBis + 1;
        }
        zeichnen();
    }
}