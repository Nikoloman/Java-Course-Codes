public class Main {
    public static void main(String[] args) {
        //Arrays of 1 dimension
        String androidVersions[] = new String[17];
        String days[] = new String[7];

        //Array of 2 dimensions
        String [][] cities = new String[4][2];
        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */

        //Array of 3 dimensions
        int numbers[][][] = new int[2][2][2];
        /*
         *      +--------+
         *     /        /|
         *    /        / |
         *   +--------+  |
         *   |        |  |
         *   |        |  +
         *   |        | /
         *   |        |/
         *   +--------+
         * */

        //Array of 4 dimensions
        int numbers4d[][][][] = new int[3][3][3][3];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        cities[0][0] = "México";
        cities[0][1] = "CDMX";
        cities[1][0] = "México";
        cities[1][1] = "Guadalajara";
        cities[2][0] = "Colombia";
        cities[2][1] = "Bogotá";
        cities[3][0] = "Colombia";
        cities[3][1] = "Medellín";
    }
}