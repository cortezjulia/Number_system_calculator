import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        BinaryOperator bi = new BinaryOperator();

        Scanner s1 = new Scanner(System.in);

        System.out.printf("Enter a binary number: ");
        String binary_recive = s1.nextLine();
        bi.setName(binary_recive);

        System.out.print("Number: " + bi.getName());

        bi.decimal_converter();


        DecimalOperator deci=new DecimalOperator();
        Scanner s2 = new Scanner(System.in);

        System.out.printf("Enter a decimal number: ");
        int decimal_recive = s2.nextInt();

        deci.setName(decimal_recive);

        System.out.print("Number: " + deci.getName());

        deci.decimal_converter();

    }
}