import java.security.Key;
import java.util.Scanner;

public class CallMenu {
    private int choise_key;

    public CallMenu() {

    }

    public int getName() {
        return this.choise_key;
    }

    public void setName(int choise_key) {
        this.choise_key = choise_key;
    }

    public void choise_operator() {

        if (choise_key == 1)// insert binary
        {

            System.out.println("Enter a binary number: ");
            Scanner s1 = new Scanner(System.in);
            String binary_recive = s1.nextLine();
            BinaryOperator bi = new BinaryOperator();
            bi.setName(binary_recive);
            System.out.println("Number: " + bi.getName());
            bi.decimal_converter();
            bi.hexadecimal_converter();
        }

        else if (choise_key == 2)// insert decimal
        {
            
            System.out.printf("Enter a decimal number: ");
            Scanner s2 = new Scanner(System.in);
            int decimal_recive = s2.nextInt();
            DecimalOperator deci = new DecimalOperator();
            deci.setName(decimal_recive);
            // System.out.print("Number: " + deci.getName());
            deci.decimal_converter();
            deci.hexadecimal_converter();

        } else if (choise_key == 3)// insert hexadecimal
        {
            HexadecimalOperator hexa = new HexadecimalOperator();
            Scanner s3 = new Scanner(System.in);
            System.out.printf("Enter a Hexadecimal number: ");
            int hexadecimal_recive = s3.nextInt();
            hexa.setName(hexadecimal_recive);
            int decimal_recive = hexa.decimal_converter();
            DecimalOperator deci = new DecimalOperator();
            deci.setName(decimal_recive);
            deci.decimal_converter();

        }
    }
}
