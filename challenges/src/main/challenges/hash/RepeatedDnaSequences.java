package main.challenges.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class RepeatedDnaSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));

	}
	
	 public static List<String> findRepeatedDnaSequences(String s) {
	     Set<String> seen = new HashSet<>();
	        Set<String> repeated = new HashSet<>();
	        
	        // Traverse the string to find all 10-letter-long sequences
	        for (int i = 0; i <= s.length() - 10; i++) {
	            String sequence = s.substring(i, i + 10);  // Get 10-letter substring
	            
	            // If the sequence is seen and not already marked as repeated, add to repeated set
	            if (!seen.add(sequence)) {
	                repeated.add(sequence);
	            }
	        }
	        
	        // Return the list of repeated sequences
	        return new ArrayList<>(repeated);
	    }
	 
	   public static List<String> findRepeatedDnaSequencesMap(String s) {
	        Map<String, Integer> dnaMap = new HashMap<>();
	        List<String> result = new ArrayList<>();

	        // Traverse the string and get every 10-letter-long substring
	        for (int i = 0; i <= s.length() - 10; i++) {
	            String sequence = s.substring(i, i + 10);
	            
	            // Add or update the count in the map
	            dnaMap.put(sequence, dnaMap.getOrDefault(sequence, 0) + 1);
	        }
	        
	        // Collect all sequences that appeared more than once
	        for (Map.Entry<String, Integer> entry : dnaMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                result.add(entry.getKey());
	            }
	        }

	        return result;
	    }

}
