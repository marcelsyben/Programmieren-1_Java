class Linie{
    Punkt startpunkt;
    Punkt endpunkt;
    
    Linie (Punkt start, Punkt ende){
    this.startpunkt = start;
    this.endpunkt = ende;
   }
   
   Punkt getStartpunkt(){
    return this.startpunkt;
   }
   
   Punkt getEndpunkt(){
    return this.endpunkt;
    }
   
   void setStartpunkt(){
    this.startpunkt = startpunkt;
   }
   
   void setEndpunkt(){
    this.endpunkt = endpunkt;
    }
    
    void darstellen(Interaktionsbrett ib){
       Punkt startx=getStartpunkt();
       Punkt starty=getStartpunkt();
       Punkt endex=getEndpunkt();
       Punkt endey=getEndpunkt();
        ib.neueLinie(startx.getx(), starty.gety(), endex.getx(), endey.gety());
    }  
    
}