package src.Monopoly;

import java.util.ArrayList;
public class Plateau {
    private De de1; 
    private De de2; 
    private ArrayList<Case> cases;
    

    Plateau(){
        this.de1.setValeur(0);
        this.de2.setValeur(0);
        this.cases = new ArrayList<Case>();

    }
    
    public ArrayList<Case> getCase() {
        return cases;
    }

    public int getDe() {
        return (de1.getValeur() + de2.getValeur());
    }
    
    

    
}
