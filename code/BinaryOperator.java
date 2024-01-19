import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class BinaryOperator {
    private String number;
    private double decimal_sum = 0;

    public BinaryOperator() {

    }

    public void decimal_converter() { //converte binario em decimal
     decimal_sum = 0;

        char[] digits = number.toCharArray();
        double j = (digits.length) - 1;

        for (int i = 0; i < digits.length; i++) {
            int digit_int = Character.getNumericValue(digits[i]);
            double conversion = (Math.pow(2, j)) * (double) digit_int;
            j--;
            decimal_sum = decimal_sum + conversion;

        }

        System.out.println("Decimal is: " + decimal_sum);
    }

    public void hexadecimal_converter() { //converte o número decimal da função anterior em hexadecimal
        HexadecimalOperator deci_hexi = new HexadecimalOperator();
        
        int decimal_final=(int)decimal_sum;
        deci_hexi.setName(decimal_final);
        // System.out.print("Number: " + bi.getName());
        deci_hexi.hexadecimal_converter();

    }

    public String getName() {
        return this.number;
    }

    public void setName(String usuary_number) {
        this.number = usuary_number;
    }
}
