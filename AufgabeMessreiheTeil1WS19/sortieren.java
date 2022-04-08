import java.util.*;
class sortieren{ 
    //private ArrayList<Integer> liste;
    ArrayList<Integer> liste = new ArrayList();
    public void arraysortieren(){ 
        int a=1;
        liste.add(1);
        liste.add(5);
        liste.add(787);
        liste.add(43);
        liste.add(6);
        liste.add(8);
        liste.add(0);
        liste.add(499999999);
        
        for(int k=1; k<liste.size();k++){
            for(int b=0; b<(this.liste.size()-k);b++){
                if(this.liste.get(b)>liste.get(b+1)){
                    a=liste.get(b);
                    liste.set(b,liste.get (b+1));
                    liste.set(b+1,a);

                }
            }
        }
        System.out.println(liste.toString());
    }
}