class Strich{
    
    Punkt startpunkt;
    Punkt zielpunkt;
    
    Punkt getstartpunkt(){
        return this.startpunkt;
    
    }
    
    void setstartpunkt(Punkt startpunkt){
        this.startpunkt = startpunkt;
    
    }
    
    
        Punkt getzielpunkt(){
        return this.zielpunkt;
    
    }
    
    void setzielpunkt(Punkt zielpunkt){
        this.zielpunkt = zielpunkt;
    
    }
    
    Strich(Punkt startpunkt, Punkt zielpunkt){
        this.startpunkt = startpunkt;
        this.zielpunkt = zielpunkt;
    }
    
    
    
    void darstellen(Interaktionsbrett  ib){
        Punkt startpunkt = getstartpunkt();
        Punkt zielpunkt = getzielpunkt();
        ib.neueLinie(startpunkt.x, startpunkt.y,zielpunkt.x,zielpunkt.y);
    }
}