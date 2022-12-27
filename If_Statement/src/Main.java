import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Reads in console
        Scanner in = new Scanner(System.in);

        System.out.println("Write a number");
        int num1 = in.nextInt();

        if (num1 > 0){
            System.out.println("The number is positive");
        }
        else{
            if (num1 < 0){
                System.out.println("The number is negative");
            }
            else{
                System.out.println("The number is zero");
            }
        }
    }
}