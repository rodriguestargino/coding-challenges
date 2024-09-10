package main.challenges.arrays;

public class FindMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array = {4,5,6,0,1,2,3};
		
		
		System.out.println(findMin(array));

	}
	
    public static int findMin(int[] nums) {

    	int left = 0;
    	int rigth = nums.length -1;
    	
    	while(left<rigth) {
    		int mid = left + rigth >>1;
    	
    		if(nums[mid]>nums[rigth]) {
    			left = mid +1;
    		}else {
    			rigth = mid;
    		}
    	}
    	
    	return nums[left];
    }

}
