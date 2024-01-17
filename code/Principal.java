import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        BinaryOperator bi = new BinaryOperator();

        Scanner s = new Scanner(System.in);

        System.out.printf("Enter a binary number: ");
        String recive = s.nextLine();
        bi.setName(recive);

        System.out.print("Number: " + bi.getName());

        bi.decimal_converter();

    }
}