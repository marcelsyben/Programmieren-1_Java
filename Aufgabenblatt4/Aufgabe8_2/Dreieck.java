class Dreieck{
    Punkt punkt1;
    Punkt punkt2;
    Punkt punkt3;
    
    Dreieck(Punkt punkt1, Punkt punkt2, Punkt punkt3){
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
        this.punkt3 = punkt3; 
    }
    
    Punkt getPunkt1(){
        return this.punkt1;
    }
    
    Punkt getPunkt2(){
        return this.punkt2;
    }
    
    Punkt getPunkt3(){
        return this.punkt3;
    }
    
    void setPunkt1() {
        this.punkt1=punkt1;
    }
    
    void setPunkt2(){
        this.punkt2=punkt2;
    }
    
    void setPunkt3(){
        this.punkt3=punkt3;
    }
    
    void darstellen(Interaktionsbrett ib){
        Punkt p1x = getPunkt1();
        Punkt p1y = getPunkt1();
        Punkt p2x = getPunkt2();
        Punkt p2y = getPunkt2();
        Punkt p3x = getPunkt3();
        Punkt p3y = getPunkt3();
        ib.neueLinie(p1x.getx(), p1y.gety(), p2x.getx(), p2y.gety());
        ib.neueLinie(p2x.getx(), p2y.gety(), p3x.getx(), p3y.gety());
        ib.neueLinie(p1x.getx(), p1y.gety(), p3x.getx(), p3y.gety());
    }
}