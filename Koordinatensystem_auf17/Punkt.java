class Punkt{
    int x;
    int y;
    boolean istOK;
    
    
    
    int getx(){
        
        return this.x;
        
        
    
    }
    
    void setx(int x){
        if (this.x < 360 && this.x > 0){
        this.x = x;} else (return "fehler");
        
    
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