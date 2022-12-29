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

        //Normal For
        for (int i = 0; i < androidVersions.length; i++){
            System.out.println(androidVersions[i]);
        }

        System.out.println();

        //For each
        for (String version : androidVersions) {
            System.out.println(version);
        }

        System.out.println();

        //Nested For
        for (int i = 0; i < cities.length; i ++){
            for (int j = 0; j < cities[i].length; j++){
                System.out.println(cities[i][j]);
            }
        }

        System.out.println();

        //Nested Foreach
        for (String pair[] : cities) {
            for (String name : pair) {
                System.out.println(name);
            }
        }
    }
}