import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter the data type you want to convert: ");

            System.out.println("1 - Binary       2 - Decimal       3 - Hexadecimal");
            System.out.printf("Insert your option: ");

            Scanner s = new Scanner(System.in);
            int choise_key = s.nextInt();

            CallMenu menu = new CallMenu();
            menu.setName(choise_key);
            menu.choise_operator();
        }

    }
}
