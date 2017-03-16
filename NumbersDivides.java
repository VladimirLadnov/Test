import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersDivides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> integList = new ArrayList<>();
        for (int i = 1; i < a; i++) {
            if((a % i) == 0){
                integList.add(i);
            }
        }
        System.out.println(integList);
    }
}
