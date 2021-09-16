package main;

public class Carte {
    private String symbole;
    private boolean visible;

    public Carte(String symbole) {
        this.symbole = symbole;
        this.visible = false;
    }

    public String getSymbole() {
        return symbole;
    }

    public String getAffichage() {
        if (this.visible) {
            return this.symbole;
        }
        return " ";
    }

    public boolean equals(Carte other) {
        return this.symbole.equals(other.symbole);
    }
}
