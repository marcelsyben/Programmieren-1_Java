class Fahrkarte{
    String gruppe;
    String gueltigkeit;
    int start;
    int ziel;
    int preisstufe;
    int id1;
    int id2;
    int id3;
    String druckzeit;
    double gesamtpreis;
    double mwst;
    
    Fahrkarte(String gruppe, String gueltigkeit, int start, int ziel, int preisstufe, int id1,
    int id2, int id3, String druckzeit, double gesamtpreis, double mwst){
        
        this.gruppe = gruppe;
        this.gueltigkeit = gueltigkeit;
        this.start = start;
        this.ziel = ziel;
        this.preisstufe = preisstufe;
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
        this.druckzeit = druckzeit;
        this.gesamtpreis = gesamtpreis;
        this.mwst = mwst;
    }
    
    
}