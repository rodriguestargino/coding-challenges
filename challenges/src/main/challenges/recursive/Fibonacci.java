package main.challenges.recursive;

public class Fibonacci {
	
	public int fibRecursive(int n) {

		// Base cases
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		// Recursive case
		return fibRecursive(n - 1) + fibRecursive(n - 2);

	}

	public int fibIterative(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		int prev1 = 1, prev2 = 0, current = 0;

		for (int i = 2; i <= n; i++) {
			current = prev1 + prev2;
			prev2 = prev1;
			prev1 = current;
		}

		return current;

	}
}
