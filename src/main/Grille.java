package main;

public class Grille {
    private int nbLignes;
    private int nbColonnes;
    private Carte[][] cartes;

    public Grille(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.cartes = new Carte[nbLignes][nbColonnes];
        this.remplirGrille();
    }

    private void remplirGrille() {
        for (int ligne = 0; ligne < this.nbLignes; ligne++) {
            for (int colonne = 0; colonne < this.nbColonnes; colonne++) {
                this.cartes[ligne][colonne] = new Carte(String.valueOf(ligne));
            }
        }
    }

    public int getNbLignes() {
        return nbLignes;
    }

    public int getNbColonnes() {
        return nbColonnes;
    }

    public void afficher() {
        System.out.println();

        // afficher une ligne avec les noms des colonnes
        System.out.print("  ");
        for (int colonne = 1; colonne <= this.nbColonnes; colonne++) {
            System.out.print(String.format("%02d", colonne) + "  ");
        }
        System.out.println();

        // afficher la bordure supérieure de la grille
        System.out.print(" -");
        for (int colonne = 0; colonne < this.nbColonnes; colonne++) {
            System.out.print("----");
        }
        System.out.println();

        for (int ligne = 0; ligne < this.nbLignes; ligne++) {
            // afficher la lettre correspondant au numéro de ligne
            System.out.print((char) (ligne + 'A'));

            // afficher une case pour chaque colonne
            System.out.print("|");
            for (int colonne = 0; colonne < this.nbColonnes; colonne++) {
                String affiche = this.cartes[ligne][colonne].getAffichage();
                System.out.print(" " + affiche + " |");
            }
            System.out.println();

            // afficher une bordure entre chaque ligne
            System.out.print(" -");
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }
}
