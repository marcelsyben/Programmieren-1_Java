class GeoobjektAusgabe{
    Interaktionsbrett ib = new Interaktionsbrett();
    GeoobjektEingabe geoe = new GeoobjektEingabe();
    
    void punktAusgeben(){
        Punkt p = geoe.punktEingeben();
        ib.neuerPunkt(p.getx(), p.gety());
    }
    
    void linieAusgeben(){
        Linie l = geoe.linieEingeben();
        int x1 = l.getStartpunkt().getx();
        int y1 = l.getStartpunkt().gety();
        int x2 = l.getEndpunkt().getx();
        int y2 = l.getEndpunkt().gety();
        ib.neueLinie(x1, y1, x2, y2);
     }
     
    void kreisAusgeben(){
        Kreis k = geoe.kreisEingabe();
        int r = k.getRadius();
        int ausgpx = k.getAusgangspunkt().getx();
        int ausgpy = k.getAusgangspunkt().gety();
        ib.neuerKreis(ausgpx, ausgpy, r);
    }
    
    void rechteckAusgeben(){
        Rechteck r = geoe.rechteckEingabe();
        int x = r.getPunkt().getx();
        int y = r.getPunkt().gety();
        int b = r.getGroesex();
        int h = r.getGroesey();
        ib.neuesRechteck(x, y, b, h);
    }
    
    void dreieckAusgeben(){
        Dreieck d = geoe.dreieckEingabe();
        int x1 = d.getPunkt1().getx(); 
        int y1 = d.getPunkt1().gety();
        int x2 = d.getPunkt2().getx();
        int y2 = d.getPunkt2().gety();
        int x3 = d.getPunkt3().getx();
        int y3 = d.getPunkt3().gety();
        ib.neueLinie(x1, y1, x2, y2);
        ib.neueLinie(x2, y2, x3, y3);
        ib.neueLinie(x3, y3, x1, y1);
    }
}