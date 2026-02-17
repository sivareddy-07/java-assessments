public class task2 {
	public static long nthFibonacci(int n) {
		if (n <= 0) return 0;
		if (n == 1) return 0;
		if (n == 2) return 1;
		long a = 0;
		long b = 1;
		long c = 0;
		for (int i = 3; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println("10th Fibonacci (1-based F1=0, F2=1): " + nthFibonacci(n));
	}
}
