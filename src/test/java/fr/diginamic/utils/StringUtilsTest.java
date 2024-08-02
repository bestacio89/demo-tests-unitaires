package fr.diginamic.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testLevenshteinDistanceEqualStrings() {
        assertEquals(0, StringUtils.levenshteinDistance("test", "test"));
    }

    @Test
    public void testLevenshteinDistanceDifferentStrings() {
        assertEquals(1, StringUtils.levenshteinDistance("test", "tost"));
        assertEquals(3, StringUtils.levenshteinDistance("kitten", "sitting"));
        assertEquals(2, StringUtils.levenshteinDistance("flaw", "lawn"));
    }

    @Test
    public void testLevenshteinDistanceEmptyStrings() {
        assertEquals(4, StringUtils.levenshteinDistance("", "test"));
        assertEquals(4, StringUtils.levenshteinDistance("test", ""));
    }

    @Test
    public void testLevenshteinDistanceWithSpaces() {
        assertEquals(1, StringUtils.levenshteinDistance("test", " test"));
        assertEquals(3, StringUtils.levenshteinDistance("kitten", " sittin"));
    }

    @Test
    public void testLevenshteinDistanceCaseSensitive() {
        assertEquals(1, StringUtils.levenshteinDistance("test", "Test"));
        assertEquals(1, StringUtils.levenshteinDistance("kitten", "Kitten"));
    }

    @Test
    public void testLevenshteinDistanceNullInputs() {
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.levenshteinDistance(null, "test");
        });
        assertEquals("Les chaînes de caractères ne doivent pas être nulles.", exception1.getMessage());

        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.levenshteinDistance("test", null);
        });
        assertEquals("Les chaînes de caractères ne doivent pas être nulles.", exception2.getMessage());

        IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.levenshteinDistance(null, null);
        });
        assertEquals("Les chaînes de caractères ne doivent pas être nulles.", exception3.getMessage());
    }
}
