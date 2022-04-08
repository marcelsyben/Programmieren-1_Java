class InteraktionsbrettSpielerei{
    void SchoenesBild(){
        Interaktionsbrett x= new Interaktionsbrett();
        x.neueLinie(50,50,50,60);
        x.neueLinie(50,60,60,60);
        x.neueLinie(60,50,60,60);
        x.neueLinie(50,50,60,50);
        x.neueLinie(50,50,60,60);
        x.neueLinie(50,60,60,50);
        x.neueLinie(50,50,55,40);
        x.neueLinie(60,50,55,40);
        
        x.neuerKreis(65,70,10);
        x.neuerKreis(80,80,10);
        x.neuerKreis(95,70,10);
        x.neuerKreis(110,80,10);
        x.neuerKreis(125,70,10);
        
        
        
    }
    
    
    void mondrian(Interaktionsbrett ib, int x, int y, int faktor){
        
        ib.neuesRechteck(x,y,60*faktor,60*faktor);
        ib.neuesRechteck(x,y,30*faktor,30*faktor);
        ib.neuesRechteck(x,y,10*faktor,10*faktor);
    }

}