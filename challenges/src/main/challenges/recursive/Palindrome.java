package main.challenges.recursive;

import main.challenges.util.ListNode;

public class Palindrome {

	public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
           return true;
       }
       
       // Step 1: Find the middle of the list using two pointers
       ListNode slow = head, fast = head;
       
       while (fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;
       }
       
       // Step 2: Reverse the second half of the list
       ListNode secondHalf = reverseList(slow);
       ListNode firstHalf = head;
       
       // Step 3: Compare both halves
       while (secondHalf != null) {
           if (firstHalf.val != secondHalf.val) {
               return false;
           }
           firstHalf = firstHalf.next;
           secondHalf = secondHalf.next;
       }
       
       return true;
   }
   
   // Helper method to reverse a linked list
   private ListNode reverseList(ListNode head) {
       ListNode prev = null, curr = head;
       
       while (curr != null) {
           ListNode nextTemp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nextTemp;
       }
       
       return prev;
  
   }
   
   class SolutionRecursive {
	    private ListNode frontPointer;

	    public boolean isPalindrome(ListNode head) {
	        frontPointer = head;
	        return recursivelyCheck(head);
	    }

	    private boolean recursivelyCheck(ListNode currentNode) {
	        if (currentNode == null) {
	            return true; // Base case: reached the end of the list
	        }

	        // Recursively go to the end of the list
	        boolean isPalindrome = recursivelyCheck(currentNode.next);

	        // If previous calls say it's not a palindrome, return false
	        if (!isPalindrome) {
	            return false;
	        }

	        // Check if the current node's value matches the front pointer's value
	        boolean valuesMatch = (currentNode.val == frontPointer.val);

	        // Move the front pointer one step forward
	        frontPointer = frontPointer.next;

	        return valuesMatch;
	    }
	}


}
