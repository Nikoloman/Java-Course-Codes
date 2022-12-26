public class Main {
    public static void main(String[] args) {
        double num1 = 2.1;
        double num2 = 4.7;

        //Prints Pi
        System.out.println(Math.PI);

        //Prints the round of both numbers, to the top and to the bottom
        System.out.println(Math.ceil(num1));
        System.out.println(Math.floor(num2));

        num1 = 9;
        num2 = 2;

        //Prints the power of the first number by the second number
        System.out.println(Math.pow(num1, num2));

        //Prints the biggest number
        System.out.println(Math.max(num1, num2));

        //Prints the square root of a number
        System.out.println(Math.sqrt(num1));

        //Area of a circle where num1 is the radius
        System.out.println(Math.PI * Math.pow(num1, 2));
        
        //Area of a sphere
        System.out.println(4 * Math.PI * Math.pow(num1, 2));

        //Volume of a sphere
        System.out.println((4 / 3) * Math.PI * Math.pow(num1, 3));
    }
}