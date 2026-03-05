/**
 * UC7: Store Character Pattern in a Class
 * Renders "OOPS" banner using CharacterPattern mappings.
 */
public class OOPSBannerUC7 {

    public static void main(String[] args) {

        // Create pattern objects
        CharacterPattern o = new CharacterPattern('O', new String[]{
                " ******** ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *      * ",
                " ******** "
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                " ******** ",
                " *      * ",
                " *      * ",
                " ******** ",
                " *        ",
                " *        ",
                " *        "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                " ******** ",
                " *        ",
                " *        ",
                " *******  ",
                "        * ",
                "        * ",
                " ******** "
        });

        // Store objects (array of objects)
        CharacterPattern[] patterns = { o, p, s };

        // Retrieve needed patterns (for "OOPS" => O, O, P, S)
        String[] O = getCharacterPattern(patterns, 'O');
        String[] P = getCharacterPattern(patterns, 'P');
        String[] S = getCharacterPattern(patterns, 'S');

        // Assemble the final banner lines using StringBuilder (efficient concatenation)
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            line.append(O[i]).append("  ");
            line.append(O[i]).append("  ");
            line.append(P[i]).append("  ");
            line.append(S[i]);
            banner[i] = line.toString();
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    /**
     * Inner static class that encapsulates a character and its 7-line banner pattern.
     * Demonstrates Encapsulation, Immutability, and SRP.
     */
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern.
         *
         * @param character the character (example: 'O', 'P', 'S')
         * @param pattern   the 7-line banner pattern for the character
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character.
         *
         * @return the character this object represents
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern.
         *
         * @return the 7-line banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Returns the banner pattern for a requested character from a list of mappings.
     *
     * @param patterns array of CharacterPattern objects
     * @param ch       character whose pattern is required
     * @return 7-line pattern array for the given character
     * @throws IllegalArgumentException if character pattern not found
     */
    static String[] getCharacterPattern(CharacterPattern[] patterns, char ch) {
        for (CharacterPattern cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        throw new IllegalArgumentException("Pattern not found for character: " + ch);
    }
}