class Rechteck{
    int groesex;
    int groesey;
    Punkt punkt;
    
    Rechteck(int groesex, int groesey, Punkt punkt){
        this.groesex=groesex;
        this.groesey=groesey;
        this.punkt = punkt;
    }
    
    int getGroesex(){
        return groesex;
    }
    
    int getGroesey(){
        return groesey;
    }
    
    Punkt getPunkt(){
        return punkt;
    }
    
    void setGroesex(){
        this.groesex=groesex;
    }
    
    void setGroesey(){
        this.groesey=groesey;
    }
    
    void setPunkt(){
        this.punkt =punkt;
    }
    
    void darstellen (Interaktionsbrett ib){
       Punkt px = getPunkt();
       Punkt py = getPunkt();
       ib.neuesRechteck(px.getx(), py.gety(), getGroesex(), getGroesey());
    }
}