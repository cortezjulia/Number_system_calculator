import java.util.ArrayList;
import java.lang.String;

public class DecimalOperator {

    int number;

    public DecimalOperator() {

    }

    public int getName() {
        return this.number;
    }

    public void setName(int usuary_number) {
        this.number = usuary_number;
    }

    public void decimal_converter() {

        int division;
        int rest;
        
        
        ArrayList<String> binary_list = new ArrayList<>();
        String result;

        while (number >= 2) {
            division = number / 2;
            rest = number % 2;
            if(number!=2)
            {
                binary_list.add(String.valueOf(rest));
            }
            else{
                binary_list.add(String.valueOf(rest));
                binary_list.add(String.valueOf(division));

            }
            number = division;
            
        }
        // Convertendo caracteres para String usando concatenação
        // String resultado = String.valueOf(char1) + String.valueOf(char2) +
        // String.valueOf(char3);
        result=binary_list.get(0);

        for (int k = 1; k < binary_list.size(); k++) {

            result = binary_list.get(k)+result;
            //System.out.println("Number: " + var);

            //result = String.valueOf(binary_list.get(k)) + result;

        }
        System.out.println("Number: " + result);
    }

}
