package TP;


public class Etudiant {
    private String nom;
    private String filliere;
    private int id;
    private double moyenne;
    private static int nbEtudiants = 0;
    private static double sommeMoyennes = 0; // Doit être static pour être partagée entre tous les étudiants

    public Etudiant(String nom, String filliere, double m) {
        if(m > 20 || m < 0) {
            System.out.println("Error: La moyenne doit être entre 0 et 20");
        } else {
            this.id = ++nbEtudiants;
            sommeMoyennes += m; // Ajoute la moyenne à la somme totale
            this.nom = nom;
            this.filliere = filliere;
            this.moyenne = m;
        }
    }

    public String getNom() {
        return nom;
    }

    public String getFilliere() {
        return filliere;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMoyenne(double moyenne) { //Cette partie est trés important
        if(moyenne >= 0 && moyenne <= 20) {
            // Soustrait l'ancienne moyenne et ajoute la nouvelle
            sommeMoyennes = sommeMoyennes - this.moyenne + moyenne;
            this.moyenne = moyenne;
        } else {
            System.out.println("Error: La moyenne doit être entre 0 et 20");
        }
    }

    public void setFilliere(String filliere) {
        this.filliere = filliere;
    }

    public boolean aReussi() {
        return this.moyenne >= 10; // Simplifié
    }

    public boolean estMeilleur(Etudiant e) {
        return this.moyenne >= e.getMoyenne(); // Simplifié
    }

    public void affichage() {
        System.out.println("Le nom de l'étudiant est " + this.nom + " et sa filière " + this.filliere);
    }

    @Override
    public String toString() {
        return this.nom + " " + this.filliere + " " + this.moyenne;
    }

    // Exercice 2 - Méthodes statiques
    public static int getNbEtudiants() {
        return nbEtudiants;
    }

    public static double getMoyArithMoyennes() {
        if(nbEtudiants == 0) {
            return 0;
        }
        return sommeMoyennes / nbEtudiants;
    }


    public static double getSommeMoyennes() {
        return sommeMoyennes;
    }




}

