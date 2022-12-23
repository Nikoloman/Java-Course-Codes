public class Main {
    public static void main(String[] args) {
        //byte, short, int, long
        System.out.println("Bytes");
        System.out.println("Bits: " + Byte.SIZE);
        System.out.println("Bytes: " + Byte.BYTES);
        System.out.println("Minimum value: " + Byte.MIN_VALUE);
        System.out.println("Maximum value:  " + Byte.MAX_VALUE);
        System.out.println("\nShorts");
        System.out.println("Bits: " + Short.SIZE);
        System.out.println("Bytes tipo short: " + Short.BYTES);
        System.out.println("Minimum value: " + Short.MIN_VALUE);
        System.out.println("Maximum value: " + Short.MAX_VALUE);
        System.out.println("\nIntegers");
        System.out.println("Bits: " + Integer.SIZE);
        System.out.println("Bytes: " + Integer.BYTES);
        System.out.println("Minimum value:" + Integer.MIN_VALUE);
        System.out.println("Maximum value:" + Integer.MAX_VALUE);
        System.out.println("\nLongs");
        System.out.println("Bits:" + Long.SIZE);
        System.out.println("Bytes:" + Long.BYTES);
        System.out.println("Minimum value:" + Long.MIN_VALUE);
        System.out.println("Maximum value:" + Long.MAX_VALUE);

        byte byteVar = 15;
        System.out.println("byteVar = " + byteVar);
        short shortVar = 100;
        System.out.println("shortVar = " + shortVar);
        int intVar = 500;
        System.out.println("intVar = " + intVar);
        long longVar = 1000;
        System.out.println("longVar = " + longVar);

        var number = 10;
        System.out.println("number = " + number);
    }
}