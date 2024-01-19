import java.util.ArrayList;
import java.lang.String;

public class DecimalOperator {

    private int number;
    private String result;
    private int original_number;

    public DecimalOperator() {

    }

    public int getName() {
        return this.number;
    }

    public void setName(int usuary_number) {
        this.number = usuary_number;
    }

    public void decimal_converter() { //converte decimal em binario
        original_number=number;
        int division;
        int rest;
        
        
        ArrayList<String> binary_list = new ArrayList<>();
        

        while (number >= 2) {
            division = number/ 2;
            rest = number % 2;
            
            
                binary_list.add(String.valueOf(rest));
        
            number = division;
        }
        binary_list.add(String.valueOf(number));

        // Convertendo caracteres para String usando concatenação
        // String resultado = String.valueOf(char1) + String.valueOf(char2) +
        // String.valueOf(char3);
        result=binary_list.get(0);

        for (int k = 1; k < binary_list.size(); k++) {

            result = binary_list.get(k)+result;
            //System.out.println("Number: " + var);

            //result = String.valueOf(binary_list.get(k)) + result;

        }
        System.out.println("Binary: " + result);
    }
    public void hexadecimal_converter() //converte decimal em hexadecimal
    {
        HexadecimalOperator deci_hexi = new HexadecimalOperator();
        
        deci_hexi.setName(original_number);
        // System.out.print("Number: " + bi.getName());
        deci_hexi.hexadecimal_converter();
    }

}
