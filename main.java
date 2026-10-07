package td1ex9;

public class main {

    public static void main(String[] args) {

        Mot_dict m1 = new Mot_dict("arbre", "plante avec un tronc");
        Mot_dict m2 = new Mot_dict("chat", "animal domestique");
        Mot_dict m3 = new Mot_dict("maison", "lieu ou on habite");
        Mot_dict m4 = new Mot_dict("ordinateur", "machine electronique");

        Dictionnaire d = new Dictionnaire(10, "mon dictionnaire");

        d.Ajouter_Mot(m1);
        d.Ajouter_Mot(m2);
        d.Ajouter_Mot(m3);
        d.Ajouter_Mot(m4);

        System.out.println("contenu du dictionnaire :");
        d.Lister_dictionnaire();

        System.out.println("\nrecherche du mot");
        System.out.println(d.Recherche_dicho("chat"));

        System.out.println("\nsuppression ");
        d.Supprimer_Mot(m2);
        d.Lister_dictionnaire();

        System.out.println("\nnombre de synonymes :");
        System.out.println(d.Nombre_synonyme(m1));
    }
}