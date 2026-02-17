public class task3 {
    public static int isPalinNum(int input1) {
        int temp = input1;
        int rev = 0;
        while (input1 > 0) {
            rev = rev * 10 + input1 % 10;
            input1 /= 10;
        }
        if (rev != temp) return 1;
        return 2;
    }

    public static void main(String[] args) {
        int result = isPalinNum(121);
        System.out.println("Result: " + result);
    }
}

