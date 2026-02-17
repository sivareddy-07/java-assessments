public class task7 {
    static int uniqueDigitCount(int n) {
        boolean[] seen = new boolean[10];
        int count = 0;
        while (n > 0) {
            int d = n % 10;
            if (!seen[d]) {
                seen[d] = true;
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Unique digits in 12345: " + uniqueDigitCount(12345));
        System.out.println("Unique digits in 555: " + uniqueDigitCount(555));
        System.out.println("Unique digits in 34567892: " + uniqueDigitCount(34567892));
        System.out.println("Unique digits in 7000: " + uniqueDigitCount(7000));
    }
}
