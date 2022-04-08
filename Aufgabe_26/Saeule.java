public class Saeule{
    private String titel = "Vfl";
    private int wert = 16;
    
    public Saeule() {
        
    }
    
    public Saeule(String titel, int wert) {
        this.titel = titel;
        this.wert = wert;
        
    }
    
    public String getTitel(){
        return this.titel;
    }
    
    public void setTitel(String t) {
        this.titel = t;
    }
    
    public int getWert() {
        return this.wert;
    }
    
    public void setWert(int x) {
        this.wert = x;
    }
}