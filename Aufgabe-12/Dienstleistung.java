class Dienstleistung{
    int Anzahl;
    String Lampe;
    
    int getAnzahl(){
        return this.Anzahl;
        
    }
    
    void setAnzahl(int Anzahl){
        this.Anzahl = Anzahl;
        
     
    }
   
    Dienstleistung(int Anzahl, String Lampe){
        this.Anzahl = Anzahl;
        this.Lampe = Lampe;
    }
}
