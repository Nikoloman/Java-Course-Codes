public class Main {
    public static void main(String[] args) {
        //Bonus
        int salary = 1000;
        int bonus = 200;
        salary = salary + bonus;
        System.out.println(salary);

        //ISR Tax
        int tax = 50;
        salary = salary - tax;
        System.out.println(salary);

        //2 Extra Hours $20 each
        //Food: $30
        int extraHour = 20;
        int foodCost = 30;
        salary = salary + (extraHour * 2);
        salary = salary - foodCost;
        System.out.println(salary);

        //Updating Strings
        String employeeName = "Héctor";
        String employeeLastName = "Velázquez";
        employeeName = employeeName + " " + employeeLastName;
        System.out.println(employeeName);
    }
}