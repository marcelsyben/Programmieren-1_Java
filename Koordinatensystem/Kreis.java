class Kreis{

    Punkt aufhängpunkt = new Punkt(1,3);
    int radius;
    
    
    Kreis(int radius){
        this.radius = radius;
    }
    
    
        void setaufhängepunkt(Punkt aufh){
        this.aufhängpunkt = aufh;
    
    }
    
    
        Punkt getaufhängepunkt(){
        return this.aufhängpunkt;
    
    }
    
    
        void setradius(int radius){
        this.radius = radius;
    
    }
    
    
        int getradius(){
        return this.radius;
    
    }
    
    void darstellen(Interaktionsbrett  ib){
        Punkt aufhängpunkt = getaufhängepunkt();
        int radius = getradius();
        ib.neuerKreis(aufhängpunkt.x, aufhängpunkt.y,radius);
    }
    
    

}