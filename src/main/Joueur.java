package main;



public class Joueur {

    private int score;
    private final int numero;


    public Joueur(int numero){
        this.numero=numero;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumero(){
        return numero;
    }
}
