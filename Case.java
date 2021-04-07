package src.Monopoly;
public class Case {
    private int idCase;
    private String nom;
    
    public int getIdCase() {
        return idCase;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setIdCase(int idCase) {
        this.idCase = idCase;
    }
    public Case(String nom) {
        this.nom = nom;
    }
    
    
}
