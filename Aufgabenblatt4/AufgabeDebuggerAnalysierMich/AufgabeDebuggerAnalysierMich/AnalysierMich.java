class AnalysierMich{
  int kraft;
  int iq;
  
  AnalysierMich(int kraft, int iq){
    this.kraft = kraft;
    this.iq = iq;
  }
  
  void wasPassiert1(){
    this.iq = this.kraft + this.iq;
    this.kraft = this.iq - this.kraft;
    this.iq = this.iq - this.kraft;
  }
  
  void wasPassiert2(){
    this.kraft = this.kraft + this.kraft;
    int tmp = this.kraft;
    this.kraft = this.kraft + this.kraft;
    this.kraft = this.kraft + tmp;
  }
}
