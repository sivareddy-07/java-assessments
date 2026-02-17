public class task8 {
    static int mostFrequentDigit(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int max = 0, digit = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }
        return digit;
    }
    public static void main(String[] args) {
        System.out.println("Most frequent digit in 335577: " + mostFrequentDigit(335577));
        System.out.println("Most frequent digit in 444777888: " + mostFrequentDigit(444777888));
        System.out.println("Most frequent digit in 345678901: " + mostFrequentDigit(345678901));
        System.out.println("Most frequent digit in 666: " + mostFrequentDigit(666));
    }
}

