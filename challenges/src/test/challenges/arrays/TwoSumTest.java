package test.challenges.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.challenges.arrays.TwoSum;

class TwoSumTest {

	@Test
	void testTwoSum_found() {
		TwoSum solution = new TwoSum();

		// Test case 1: Expected to find [0, 1] because nums[0] + nums[1] == 9
		int[] nums1 = { 2, 7, 11, 15 };
		int target1 = 9;
		int[] result1 = solution.twoSum(nums1, target1);
		int[] expected1 = { 0, 1 };
		assertArrayEquals(expected1, result1, "Test case 1 failed");

		// Test case 2: Expected to find [1, 2] because nums[1] + nums[2] == 11
		int[] nums2 = { 3, 2, 4 };
		int target2 = 6;
		int[] result2 = solution.twoSum(nums2, target2);
		int[] expected2 = { 1, 2 };
		assertArrayEquals(expected2, result2, "Test case 2 failed");

		// Test case 3: Expected to find [0, 1] because nums[0] + nums[1] == 6
		int[] nums3 = { 3, 3 };
		int target3 = 6;
		int[] result3 = solution.twoSum(nums3, target3);
		int[] expected3 = { 0, 1 };
		assertArrayEquals(expected3, result3, "Test case 3 failed");
	}

	@Test
	void testTwoSum_notFound() {
		TwoSum solution = new TwoSum();

		// Test case where no solution is found, expecting an empty array
		int[] nums = { 1, 2, 3 };
		int target = 7;
		int[] result = solution.twoSum(nums, target);
		assertEquals(0, result.length, "Test case notFound failed");
	}

	@Test
	void testTwoSum_edgeCases() {
		TwoSum solution = new TwoSum();

		// Edge case: Only one number, no solution should be found
		int[] nums1 = { 5 };
		int target1 = 10;
		int[] result1 = solution.twoSum(nums1, target1);
		assertEquals(0, result1.length, "Edge case 1 failed");

		// Edge case: Empty array, no solution should be found
		int[] nums2 = {};
		int target2 = 5;
		int[] result2 = solution.twoSum(nums2, target2);
		assertEquals(0, result2.length, "Edge case 2 failed");
	}

}
