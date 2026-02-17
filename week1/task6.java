public class task6 {
    static int sumOfPowerDigits(int n) {
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of power digits of 155: " + sumOfPowerDigits(155));
        System.out.println("Sum of power digits of 360: " + sumOfPowerDigits(360));
        System.out.println("Sum of power digits of 9485: " + sumOfPowerDigits(9485));
    }
}
