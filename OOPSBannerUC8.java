import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Use Map for Character Patterns and Render via Function
 * Stores banner patterns in a HashMap for O(1) average lookup and renders any word.
 */
public class OOPSBannerUC8 {

    private static final int ROWS = 7;          // 7-line banner
    private static final String GAP = "  ";     // space between letters

    public static void main(String[] args) {

        // Build pattern map (Character -> 7-line String[])
        Map<Character, String[]> patterns = buildPatternMap();

        // Render the word
        renderBanner("OOPS", patterns);
    }

    /**
     * Creates and returns a map of character patterns.
     *
     * @return Map of Character to its 7-line banner pattern
     */
    static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ******** ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *      * ",
                " ******** "
        });

        map.put('P', new String[]{
                " ******** ",
                " *      * ",
                " *      * ",
                " ******** ",
                " *        ",
                " *        ",
                " *        "
        });

        map.put('S', new String[]{
                " ******** ",
                " *        ",
                " *        ",
                " *******  ",
                "        * ",
                "        * ",
                " ******** "
        });

        return map;
    }

    /**
     * Renders a word as a banner using the supplied pattern map.
     *
     * @param word     the text to render (example: "OOPS")
     * @param patterns map of character patterns
     */
    static void renderBanner(String word, Map<Character, String[]> patterns) {

        // Outer loop: each banner row (0..6)
        for (int row = 0; row < ROWS; row++) {

            // Build one full line efficiently
            StringBuilder line = new StringBuilder();

            // Inner loop: each character in the word
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                String[] pattern = patterns.get(ch);
                if (pattern == null) {
                    throw new IllegalArgumentException("No pattern found for character: " + ch);
                }

                line.append(pattern[row]);

                // add gap between letters (not after last letter)
                if (i != word.length() - 1) {
                    line.append(GAP);
                }
            }

            System.out.println(line);
        }
    }
}