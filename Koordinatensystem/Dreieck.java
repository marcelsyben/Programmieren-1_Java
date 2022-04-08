class Dreieck{
       
    Punkt ecke1;
    Punkt ecke2;
    Punkt ecke3;
    
    Punkt getecke1(){
        return this.ecke1;
    
    }
    
    void setecke1(Punkt ecke1){
        this.ecke1 = ecke1;
    
    }
    
    
    Punkt getecke2(){
        return this.ecke2;
    
    }
    
    void setecke2(Punkt ecke2){
        this.ecke2 = ecke2;
    
    }
    
        Punkt getecke3(){
        return this.ecke3;
    
    }
    
    void setecke3(Punkt ecke3){
        this.ecke3 = ecke3;
    
    }
    
    Dreieck(Punkt p1, Punkt p2, Punkt p3)
    {
        ecke1 = p1;
        ecke2 = p2;
        ecke3 = p3;
    }
    
}