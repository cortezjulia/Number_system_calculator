import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) {

        while (true) {
            System.out.println(" ");
            System.out.println("Enter the data type you want to convert: ");

            System.out.println("1 - Binary       2 - Decimal       3 - Hexadecimal");
            System.out.printf("Insert your option: ");

            Scanner s = new Scanner(System.in);
            int choise_key = s.nextInt();

            //chama o menu com escolha do tipo de dado a inserir
            CallMenu menu = new CallMenu();
            menu.setName(choise_key);
            menu.choise_operator();
            


    }
}

    private static void delay(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delay'");
    }
}

