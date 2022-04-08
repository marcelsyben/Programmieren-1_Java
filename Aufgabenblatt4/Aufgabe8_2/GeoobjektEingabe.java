class GeoobjektEingabe{
 EinUndAusgabe io = new EinUndAusgabe();
 
 Punkt punktEingeben(){
    this.io.ausgeben("X- Wert: ");
    int x = this.io.leseInteger();
    this.io.ausgeben("Y- Wert: ");
    int y = this.io.leseInteger();
    return new Punkt(x, y);
    }
    
 Linie linieEingeben(){
    this.io.ausgeben("Punk1x: ");
    int x1 = this.io.leseInteger();
    this.io.ausgeben("Punkt1y: ");
    int y1 = this.io.leseInteger();
    Punkt p1 = new Punkt(x1, y1);
    this.io.ausgeben("Punkt2x: ");
    int x2 = this.io.leseInteger();
    this.io.ausgeben("Punkt2y: ");
    int y2 = this.io.leseInteger();
    Punkt p2 = new Punkt(x2, y2);
    return new Linie(p1, p2);
    }
    
 Kreis kreisEingabe(){
    this.io.ausgeben("Ausgangspunktx: ");
    int x = this.io.leseInteger();
    this.io.ausgeben("Ausgangspunkty: ");
    int y = this.io.leseInteger();
    Punkt p = new Punkt(x, y);
    this.io.ausgeben("Radius: ");
    int r = this.io.leseInteger();
    return new Kreis(r, p);
    }
    
 Rechteck rechteckEingabe(){
    this.io.ausgeben("Breite: ");
    int b = this.io.leseInteger();
    this.io.ausgeben("Laenge: ");
    int l = this.io.leseInteger();
    this.io.ausgeben("Punktx: ");
    int x = this.io.leseInteger();
    this.io.ausgeben("Punkty: ");
    int y = this.io.leseInteger();
    Punkt p = new Punkt(x, y);
    return new Rechteck(b, l, p);
    }
    
 Dreieck dreieckEingabe(){
    this.io.ausgeben("Punkt1x: ");
    int x1 = this.io.leseInteger();
    this.io.ausgeben("Punkt1y: ");
    int y1 = this.io.leseInteger();
    Punkt p1 = new Punkt(x1, y1);
    this.io.ausgeben("Punkt2x: ");
    int x2 = this.io.leseInteger();
    this.io.ausgeben("Punkt2y: ");
    int y2 = this.io.leseInteger();
    Punkt p2 = new Punkt(x2, y2);
    this.io.ausgeben("Punkt3x: ");
    int x3 = this.io.leseInteger();
    this.io.ausgeben("Punkt3y: ");
    int y3 = this.io.leseInteger();
    Punkt p3 = new Punkt (x3, y3);
    return new Dreieck(p1, p2, p3);
    }
    
   
    
}