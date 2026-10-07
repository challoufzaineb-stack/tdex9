package td1ex9;

public class Mot_dict {

    private String Mot;
    private String Définition;

    public Mot_dict(String mot, String définition) {
        this.Mot = mot;
        this.Définition = définition;
    }

    public String getMot() {
        return Mot;
    }

    public String getDéfinition() {
        return Définition;
    }

    public void setDéfinition(String définition) {
        this.Définition = définition;
    }

    public void setMot(String mot) {
        this.Mot = mot;
    }

    public boolean synonyme(String mot) {
        return this.Mot.equalsIgnoreCase(mot);
    }
}