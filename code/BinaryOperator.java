import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class BinaryOperator {
    private String number;

    public BinaryOperator() {

    }

    public void decimal_converter() {
        double sum = 0;

        char[] digits = number.toCharArray();
        double j = (digits.length) - 1;

        for (int i = 0; i < digits.length; i++) {
            int digit_int = Character.getNumericValue(digits[i]);
            double conversion = (Math.pow(2, j)) * (double) digit_int;
            j--;
            sum = sum + conversion;

        }

        System.out.println("The binary number in decimal is: " + sum);
    }

    public String getName() {
        return this.number;
    }

    public void setName(String usuary_number) {
        this.number = usuary_number;
    }
}
