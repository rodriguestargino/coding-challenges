package main.challenges.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}
	
	public static int lengthOfLongestSubstring(String s) {

    	Set<String> repeated = new HashSet<>();
        
        // Traverse the string to find all 10-letter-long sequences
        for (int i = 0; i <= s.length()-1; i++) {
            String sequence = String.valueOf(s.charAt(i));
            
            // If the sequence is seen and not already marked as repeated, add to repeated set
            if (!repeated.add(sequence)) {
                repeated.add(sequence);
            }
        }
        
        // Return the list of repeated sequences
        return repeated.size();
    
}

}
