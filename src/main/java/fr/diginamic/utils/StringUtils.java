package fr.diginamic.utils;

/**
 * Classe qui fournit des services de traitements de chaines de caractères
 * 
 * @author DIGINAMIC
 */
public final class StringUtils {

    private StringUtils() {
        // Private constructor to prevent instantiation
    }

    /**
     * Retourne la distance de Levenshtein entre 2 chaines de caractères.
     *
     * @param lhs chaine 1
     * @param rhs chaine 2
     * @return distance de Levenshtein
     * @throws IllegalArgumentException if lhs or rhs is null
     */
    public static int levenshteinDistance(CharSequence lhs, CharSequence rhs) {
        if (lhs == null || rhs == null) {
            throw new IllegalArgumentException("Les chaînes de caractères ne doivent pas être nulles.");
        }

        int len0 = lhs.length() + 1;
        int len1 = rhs.length() + 1;

        // Use a single array to store the cost
        int[] cost = new int[len0];

        for (int i = 0; i < len0; i++) {
            cost[i] = i;
        }

        for (int j = 1; j < len1; j++) {
            int prevCost = cost[0];
            cost[0] = j;

            for (int i = 1; i < len0; i++) {
                int currentCost = cost[i];

                int match = (lhs.charAt(i - 1) == rhs.charAt(j - 1)) ? 0 : 1;

                int costReplace = prevCost + match;
                int costInsert = cost[i] + 1;
                int costDelete = cost[i - 1] + 1;

                prevCost = currentCost;
                cost[i] = Math.min(Math.min(costInsert, costDelete), costReplace);
            }
        }
        return cost[len0 - 1];
    }
}
