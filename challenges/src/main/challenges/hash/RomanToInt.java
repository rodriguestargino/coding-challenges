package main.challenges.hash;

import java.util.HashMap;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( romanToInt("MCMXCIV"));

	}
	
	 public static int romanToInt(String s) {

		 // Map of Roman numerals to their integer values
	        HashMap<Character, Integer> map = new HashMap<>();
	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D', 500);
	        map.put('M', 1000);

	        int result = 0;

	        // Traverse the Roman numeral string
	        for (int i = 0; i < s.length(); i++) {
	            int current = map.get(s.charAt(i));

	            // Check if the next character exists and its value is greater than the current
	            if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
	                result -= current; // Subtract in case of subtraction rule
	            } else {
	                result += current; // Otherwise, add the value
	            }
	        }

	        return result;
	        
	    }

}
