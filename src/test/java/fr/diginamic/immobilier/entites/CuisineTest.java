package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Tests for the Cuisine class.
 */
public class CuisineTest {

    @Test
    public void testConstructorAndGetters() {
        int etage = 2;
        double superficie = 15.5;
        Cuisine cuisine = new Cuisine(etage, superficie);

        assertNotNull(cuisine);
        assertEquals(etage, cuisine.getNumEtage());
        assertEquals(superficie, cuisine.getSuperficie(), 0.001);
    }

    @Test
    public void testGetType() {
        Cuisine cuisine = new Cuisine(1, 10.0);
        assertEquals(Piece.TYPE_CUISINE, cuisine.getType());
    }

    @Test
    public void testSetters() {
        Cuisine cuisine = new Cuisine(1, 10.0);

        cuisine.setNumEtage(3);
        assertEquals(3, cuisine.getNumEtage());

        cuisine.setSuperficie(20.0);
        assertEquals(20.0, cuisine.getSuperficie(), 0.001);
    }
}
