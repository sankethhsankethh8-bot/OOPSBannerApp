
public class OOPSBANNERAPP {

    public static void main(String[] args) {

        // Inline Array Initialization with String.join()
        String[] lines = {

                String.join("",
                        "   ***   ", "   ***   ", "  ******  ", "   ***** "),

                String.join("",
                        "  ** **  ", "  ** **  ", "  **   ** ", "  **   **"),

                String.join("",
                        " **   ** ", " **   ** ", "  **   ** ", "  **     "),

                String.join("",
                        " **   ** ", " **   ** ", "  ******  ", "   ***** "),

                String.join("",
                        " **   ** ", " **   ** ", "  **      ", "       **"),

                String.join("",
                        "  ** **  ", "  ** **  ", "  **      ", "  **   **"),

                String.join("",
                        "   ***   ", "   ***   ", "  **      ", "   ***** ")
        };

        // Enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
