class GeoobjektEingabe{
    Punkt punktEingeben;
    Strich strichEingeben;
    Kreis kreisEingeben;
    Rechteck rechteckEingeben;
    Dreieck dreieckEingeben;
    EinUndAusgabe io = new EinUndAusgabe();
    GeoobjektEingabe(Punkt p1, Strich s1, Kreis k1, Rechteck r1, Dreieck d1){
        this.punktEingeben = p1;
        this.strichEingeben = s1;
        this.kreisEingeben = k1;
        this.rechteckEingeben = r1;
        this.dreieckEingeben = d1;
        
        
        
        
        
    }
    Punkt punktEingeben()
    {
        int x = io.leseInteger("");
        int y = io.leseInteger("");
    }
    
}

