class Rechteck{
    
    Punkt ausgangspunkt;
    int breite;
    int höhe;
    
    Punkt getausgangspunkt(){
        return this.ausgangspunkt;
    
    }
    
    void setausgangspunkt(Punkt ausgangspunkt){
        this.ausgangspunkt = ausgangspunkt;
    
    }
    
    
    int getbreite(){
        return this.breite;
    
    }
    
    void setbreite(int breite){
        this.breite = breite;
    
    }
    
    
    int gethöhe(){
        return this.höhe;
    
    }
    
    void sethöhe(int höhe){
        this.höhe = höhe;
    
    }
    
    Rechteck(int breite, int höhe, Punkt ausgangspunkt){
        this.breite = breite;
        this.höhe = höhe;
        this.ausgangspunkt = ausgangspunkt;
        
    }



}