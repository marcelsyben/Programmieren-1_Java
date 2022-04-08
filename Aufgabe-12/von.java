class von{
    int stockwerk;
    String Straße;
    String Ort;


    int getstockwerk(){
        return this.stockwerk;
        
    }
    
    void setstockwerk(int stockwerk){
        this.stockwerk = stockwerk;
        
     
    }
    
    
    von(int stockwerk, String Straße, String Ort){
        this.stockwerk = stockwerk;
        this.Straße = Straße;
        this.Ort = Ort;
    
        
    }
}
