       public class task9 {
       static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    static int sumNonPrimeIndex(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(i)) sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {20,30,40,60,70,80};
        System.out.println("Array: [20, 30, 40, 60, 70, 80]");
        System.out.println("Sum of elements at non-prime indices: " + sumNonPrimeIndex(arr1));
        int[] arr2 = {11,22,33,44,55,66,77,88,99,110};
        System.out.println("\nArray: [11, 22, 33, 44, 55, 66, 77, 88, 99, 110]");
        System.out.println("Sum of elements at non-prime indices: " + sumNonPrimeIndex(arr2));
    }
}
