package src.Monopoly;

import java.util.Random;

public class Joueur {

    private String pseudo;
    private int solde;
    private int position;
    

    Joueur(String pseudo, int solde, int position){
        if(pseudo.length()>0){
            this.pseudo = pseudo;
            this.solde = 0;
            this.position = 0;
        }

    }

    public String getPseudo(){
        return this.pseudo;
    }

    public void setPseudo(String pseudo){
        if(pseudo.length()>6)
            this.pseudo = pseudo;
    }

    public int getSolde(){
        return this.solde;
    }

    public void setSolde(int ajout){
        this.solde = this.solde + ajout;
    }

    public int getPosition(){
        return this.position;
    }

    public void setPosition(int pas){
        this.position = this.position + pas;
    }

    public int lanceDe(De de1, De de2){
        de1.setValeur(getRandomNumberInRange(1,6));
        de2.setValeur(getRandomNumberInRange(1,6));

        return (de1.getValeur() + de2.getValeur());

    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }




    
}
