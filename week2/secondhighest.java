import java.util.*;
import java.util.stream.*;

public class secondhighest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        Optional<Integer> secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        
        if (secondHighest.isPresent()) {
            System.out.println(secondHighest.get());
        } else {
            System.out.println(-1);
        }
    }
}
