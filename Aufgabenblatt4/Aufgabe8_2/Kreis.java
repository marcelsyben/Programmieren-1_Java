class Kreis{
    int radius;
    Punkt ausgangspunkt;
    Kreis (int radius, Punkt apunkt){
        this.radius = radius;
        this.ausgangspunkt = apunkt;
    }
    
    int getRadius(){
        return this.radius;
    }
    
    Punkt getAusgangspunkt(){
        return this.ausgangspunkt;
    }
    
    void setRadius(){
        this.radius=radius;
    }
    
    void setAusgangspunkt(){
        this.ausgangspunkt = ausgangspunkt;
    }
    
    void darstellen(Interaktionsbrett ib){
        Punkt apunktx = getAusgangspunkt();
        Punkt apunkty = getAusgangspunkt();
        ib.neuerKreis(apunktx.getx(), apunkty.gety(),getRadius());
    }
}