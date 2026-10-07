package td1ex9;

public class Dictionnaire {
    private int nb_mots;
    private Mot_dict[] Dict;
    private String Nom;

    public Dictionnaire(int taille, String nom) {
        this.Dict = new Mot_dict[taille];
        this.nb_mots = 0;
        this.Nom = nom;
    }

    public void Ajouter_Mot(Mot_dict m) {
        if (nb_mots < Dict.length) {
            Dict[nb_mots] = m;
            nb_mots++;
            Trier();
        } else {
            System.out.println("Dictionnaire plein");
        }
    }

    public void Trier() {
        for (int i = 0; i < nb_mots - 1; i++) {
            for (int j = i + 1; j < nb_mots; j++) {
                if (Dict[i].getMot().compareTo(Dict[j].getMot()) > 0) {
                    Mot_dict temp = Dict[i];
                    Dict[i] = Dict[j];
                    Dict[j] = temp;
                }
            }
        }
    }

    public void Supprimer_Mot(Mot_dict m) {
        for (int i = 0; i < nb_mots; i++) {
            if (Dict[i].getMot().equals(m.getMot())) {
                for (int j = i; j < nb_mots - 1; j++) {
                    Dict[j] = Dict[j + 1];
                }
                Dict[nb_mots - 1] = null;
                nb_mots--;
                return;
            }
        }
    }

    public String Recherche_dicho(String mot) {
        int debut = 0;
        int fin = nb_mots - 1;

        while (debut <= fin) {
            int milieu = (debut + fin) / 2;
            int comparaison = Dict[milieu].getMot().compareTo(mot);

            if (comparaison == 0) {
                return Dict[milieu].getDéfinition();
            }

            if (comparaison < 0) {
                debut = milieu + 1;
            } else {
                fin = milieu - 1;
            }
        }

        return "Mot introuvable";
    }

    public void Lister_dictionnaire() {
        for (int i = 0; i < nb_mots; i++) {
            System.out.println(
                Dict[i].getMot() + " : " +
                Dict[i].getDéfinition()
            );
        }
    }

    public int Nombre_synonyme(Mot_dict m) {
        int compteur = 0;

        for (int i = 0; i < nb_mots; i++) {
            if (Dict[i].synonyme(m.getMot())) {
                compteur++;
            }
        }

        return compteur;
    }
}