package main.challenges.arrays;

public class TwoSum2 {

	// two-pointer strategy
	public int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			int sum = numbers[left] + numbers[right];

			if (sum == target) {
				return new int[] { left + 1, right + 1 };
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		return new int[0];

	}

	public int[] twoSumBinarySearch(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			int complement = target - numbers[i];
			int index = binarySearch(numbers, i + 1, numbers.length - 1, complement);
			if (index != -1) {
				return new int[] { i + 1, index + 1 };
			}
		}

		return new int[0];
	}

	private int binarySearch(int[] numbers, int left, int right, int target) {
		while (left <= right) {
			int mid = left + right >> 1;
			if (numbers[mid] == target) {
				return mid;
			} else if (numbers[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1; // não encontrado
	}
}
