class Punkt{
    int x;
    int y;
    
    int getx(){
        return this.x;
    
    }
    
    void setx(int x){
        this.x = x;
    
    }
    
        int gety(){
        return this.y;
    
    }
    
    void sety(int y){
        this.y = y;
    
    }
    
    Punkt(int x, int y){
        this.x = x;
        this.y = y;
        
    }
    
    
    void darstellen(Interaktionsbrett  ib){
        int x = getx();
        int y = gety();
        ib.neuerPunkt(x,y);
        
    }
    
}