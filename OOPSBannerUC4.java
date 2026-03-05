public class OOPSBannerUC4 {
    public static void main(String[] args) {

        // 7 lines, each letter is 9 chars wide.
        // We'll put 2 spaces between letters for readability.
        String[] banner = new String[7];

        banner[0] = String.join("  ",
                " ******** ",   // O
                " ******** ",   // O
                " ******** ",   // P
                " ******** "    // S
        );

        banner[1] = String.join("  ",
                " *      * ",   // O
                " *      * ",   // O
                " *      * ",   // P
                " *        "    // S
        );

        banner[2] = String.join("  ",
                " *      * ",   // O
                " *      * ",   // O
                " *      * ",   // P
                " *        "    // S
        );

        banner[3] = String.join("  ",
                " *      * ",   // O
                " *      * ",   // O
                " ******** ",   // P
                " *******  "    // S
        );

        banner[4] = String.join("  ",
                " *      * ",   // O
                " *      * ",   // O
                " *        ",   // P stem
                "        * "    // S
        );

        banner[5] = String.join("  ",
                " *      * ",   // O
                " *      * ",   // O
                " *        ",   // P stem
                "        * "    // S
        );

        banner[6] = String.join("  ",
                " ******** ",   // O
                " ******** ",   // O
                " *        ",   // P stem
                " ******** "    // S
        );

        // Enhanced for loop to print all lines
        for (String line : banner) {
            System.out.println(line);
        }
    }
}