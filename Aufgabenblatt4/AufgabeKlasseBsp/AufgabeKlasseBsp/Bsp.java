class Bsp{

    int methA(int par){
        int x = par;
        x = x + 1;
        x = x + 2;
        x = x + 3;
        return x;
    }

    int methB(int par){
        int x = par;
        int y = x + x + x;
        y = y + y;
        x = y - x;
        return x;
    }

    int methC(int par1, int par2){
        int x = par1 + par1;
        int y = par2 + par2;
        y = y - par1;
        x = x - par2;
        int ergebnis = x + y;
        return ergebnis;
    }       
}
