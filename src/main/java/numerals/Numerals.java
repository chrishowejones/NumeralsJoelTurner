package numerals;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chrishowe-jones on 03/11/2014.
 */
public class Numerals {
	
	private static int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private static String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	private static Map<String, Integer> numeralsMap = new HashMap<String, Integer>();
	
	static {
        for(int i = 0; i < numbers.length; i++){
        	numeralsMap.put(numerals[i], numbers[i]);
        }
	}
	
    public static String getNumeral(int i) {

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

	public static int getNumber(String string) throws InvalidNumeralFormatException {	
		
		if (!string.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")){
			throw new InvalidNumeralFormatException();
		}
		
		char[] numeralArray = string.toCharArray();
		int total = 0;
		
		for (int i = 0; i < numeralArray.length; i++){
			
			Integer currentNumeralValue = numeralsMap.get(String.valueOf(numeralArray[i]));
			Integer nextNumeralValue = (i < numeralArray.length - 1) ? numeralsMap.get(String.valueOf(numeralArray[i+1])) : 0;
			
			if (i == numeralArray.length - 1 || currentNumeralValue >= nextNumeralValue){
				total = total + currentNumeralValue;
			} else if (currentNumeralValue < nextNumeralValue){
				total = total + nextNumeralValue - currentNumeralValue;
				i++;
			}
		}
		return total;
	}

}