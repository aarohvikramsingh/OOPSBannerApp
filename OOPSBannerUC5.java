public class OOPSBannerUC5 {
    public static void main(String[] args) {

        // Inline array initialization: declare + initialize + populate in ONE statement
        String[] banner = {
                String.join("  ",
                        " ******** ", " ******** ", " ******** ", " ******** "),
                String.join("  ",
                        " *      * ", " *      * ", " *      * ", " *        "),
                String.join("  ",
                        " *      * ", " *      * ", " *      * ", " *        "),
                String.join("  ",
                        " *      * ", " *      * ", " ******** ", " *******  "),
                String.join("  ",
                        " *      * ", " *      * ", " *        ", "        * "),
                String.join("  ",
                        " *      * ", " *      * ", " *        ", "        * "),
                String.join("  ",
                        " ******** ", " ******** ", " *        ", " ******** ")
        };

        // Enhanced for loop to print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}