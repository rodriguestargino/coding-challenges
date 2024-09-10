package main.challenges.hash;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}
	
	public static int lengthOfLongestSubstring(String s) {

    	Set<String> repeated = new HashSet<>();
        
        for (int i = 0; i <= s.length()-1; i++) {
            String sequence = String.valueOf(s.charAt(i));
            
            if (!repeated.add(sequence)) {
                repeated.add(sequence);
            }
        }
        
        return repeated.size();
    
}

}
