package main.challenges.arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Garantir que k seja menor que n

        // Passo 1: Inverter todo o array
        reverse(nums, 0, n - 1);

        // Passo 2: Inverter os primeiros k elementos
        reverse(nums, 0, k - 1);

        // Passo 3: Inverter os elementos restantes
        reverse(nums, k, n - 1);
    }

    // Função auxiliar para inverter uma parte do array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
