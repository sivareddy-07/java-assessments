import java.util.*;

class task4 {
    public static int addLastDigits(int input1, int input2) {
        if (input1 < 0) input1 = Math.abs(input1);
        if (input2 < 0) input2 = Math.abs(input2);
        return (input1 % 10) + (input2 % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                System.out.println(addLastDigits(a, b));
            } else {
                System.out.println("Please provide two integers.");
            }
        } else {
            System.out.println("Please provide two integers.");
        }
        sc.close();
    }
}

