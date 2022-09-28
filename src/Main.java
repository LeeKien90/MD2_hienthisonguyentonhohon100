import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("in ra số nguyên tố nhỏ hơn 100");
        boolean check;
        int n = 2;
        int count = 0;
        while (n < 100) {
            check = true;
            for (int i = 2; i < n; i++)
                if (n%i == 0) {
                    check = false;
                    break;
                }
                if (check) {
                    System.out.printf("%d ", n);
                    count++;
                }

            n++;
        }
    }
}