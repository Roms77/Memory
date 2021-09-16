package test;

import main.Grille;
import org.junit.jupiter.api.Test;

public class MemoryTest {

    @Test
    void grilleTest() {
        Grille grille = new Grille(8, 8);
        grille.afficher();
    }
}
