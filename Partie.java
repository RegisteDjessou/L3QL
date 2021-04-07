package src.Monopoly;
public class Partie {
    int idPartie;
    Joueur joueur1;
    Joueur joueur2;
    static Plateau plateau;

    public Partie(int idPartie, Joueur joueur1, Joueur joueur2) {
        this.idPartie = idPartie;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }
    
}
