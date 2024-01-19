import java.util.ArrayList;

public class HexadecimalOperator {

    private int number;

    public HexadecimalOperator() {

    }

    public int getName() {
        return this.number;
    }

    public void setName(int usuary_number) {
        this.number = usuary_number;
    }

    public void hexadecimal_converter() {

        int division;
        int rest;

        ArrayList<String> binary_list = new ArrayList<>();
        String result;

        while (number >= 16) {
            division = number/ 16;
            rest = number % 16;
            binary_list.add(String.valueOf(rest));
            number = division;
            
        }

        binary_list.add(String.valueOf(number));

        // Convertendo caracteres para String usando concatenação
        // String resultado = String.valueOf(char1) + String.valueOf(char2) +
        // String.valueOf(char3);
        // result = String.valueOf(binary_list.size() - 1);
        result = binary_list.get(0);

        for (int k = 1; k < binary_list.size(); k++) {

            result = binary_list.get(k) + result;
            
            // result = String.valueOf(binary_list.get(k)) + result;

        }

        System.out.println("Hexadecimal: " + result);
    }

    public int decimal_converter() {
        double decimal_sum = 0;

        char[] digits = (String.valueOf(number)).toCharArray();
        double j = (digits.length) - 1;

        for (int i = 0; i < digits.length; i++) {
            int digit_int = Character.getNumericValue(digits[i]);
            double conversion = (Math.pow(16, j)) * (double) digit_int;
            j--;
            decimal_sum = decimal_sum + conversion;

        }
        System.out.println("Decimal: " + decimal_sum); 
        
        int decimal_final=(int)decimal_sum;
    return decimal_final;
 }
}
