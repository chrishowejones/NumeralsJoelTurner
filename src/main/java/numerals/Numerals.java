package numerals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chrishowe-jones on 03/11/2014.
 */
public class Numerals {
    public static String getNumeral(int i) {

        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        while(i != 0){
            int index = 0;
            for(int number : numbers){

                if(i >= number){
                    sb.append(numerals[index]);
                    i = i - number;
                    break;
                }
                index++;
            }
        }




        return sb.toString();

    }
}
