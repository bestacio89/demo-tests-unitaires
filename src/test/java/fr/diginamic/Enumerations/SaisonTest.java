package fr.diginamic.Enumerations;

import fr.diginamic.enumerations.Saison;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaisonTest {

    @Test
    public void testValueOfLibellePrintemps() {
        Saison saison = Saison.valueOfLibelle("Printemps");
        Assertions.assertNotNull(saison);
        Assertions.assertEquals(Saison.PRINTEMPS, saison);
    }

    @Test
    public void testValueOfLibelleEte() {
        Saison saison = Saison.valueOfLibelle("Eté");
        Assertions.assertNotNull(saison);
        Assertions.assertEquals(Saison.ETE, saison);
    }

    @Test
    public void testValueOfLibelleAutomne() {
        Saison saison = Saison.valueOfLibelle("Automne");
        Assertions.assertNotNull(saison);
        Assertions.assertEquals(Saison.AUTOMNE, saison);
    }

    @Test
    public void testValueOfLibelleHiver() {
        Saison saison = Saison.valueOfLibelle("Hiver");
        Assertions.assertNotNull(saison);
        Assertions.assertEquals(Saison.HIVER, saison);
    }

    @Test
    public void testValueOfLibelleInvalid() {
        Saison saison = Saison.valueOfLibelle("Invalid");
        Assertions.assertNull(saison);
    }

    @Test
    public void testGetLibelle() {
        Assertions.assertEquals("Printemps", Saison.PRINTEMPS.getLibelle());
        Assertions.assertEquals("Eté", Saison.ETE.getLibelle());
        Assertions.assertEquals("Automne", Saison.AUTOMNE.getLibelle());
        Assertions.assertEquals("Hiver", Saison.HIVER.getLibelle());
    }

    @Test
    public void testGetOrdre() {
        Assertions.assertEquals(1, Saison.PRINTEMPS.getOrdre());
        Assertions.assertEquals(2, Saison.ETE.getOrdre());
        Assertions.assertEquals(3, Saison.AUTOMNE.getOrdre());
        Assertions.assertEquals(4, Saison.HIVER.getOrdre());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("1. Printemps", Saison.PRINTEMPS.toString());
        Assertions.assertEquals("2. Eté", Saison.ETE.toString());
        Assertions.assertEquals("3. Automne", Saison.AUTOMNE.toString());
        Assertions.assertEquals("4. Hiver", Saison.HIVER.toString());
    }
}
