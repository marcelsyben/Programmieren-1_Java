class Punkt {
   int x;
   int y;
   Punkt (int x1, int y1){
    this.x= x1;
    this.y= y1;
    }
    
   int getx(){
       return this.x;
   }
   
   int gety(){
       return this.y;
   }
   
   void setx(){
       this.x=x;
   }
   
   void sety(){
       this.y=y;
   }
   
   void darstellen(Interaktionsbrett ib){
       ib.neuerPunkt(getx(), gety());
    }
    
}