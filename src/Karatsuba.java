import java.util.Scanner;

public class Karatsuba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a[] = new long[10];
        for (int i = 0; i < 10; i++) {
            long time = System.currentTimeMillis();
//            System.out.print(karatsuba(sc.nextInt(), sc.nextInt()) + "\n");
            karatsuba(54429, 37375);
            a[i] = System.currentTimeMillis() - time;
            System.out.print(a[i] + " ");
        }
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += a[i];
        }
        System.out.print(sum / 10);
    }

    public static int karatsuba(int a, int b) {
        if (a < 10 && b < 10)
            return a * b;
        int tens = (a / 10) * (b / 10);
        int ones = (a % 10) * (b % 10);
        int sum1 = a / 10 + a % 10;
        int sum2 = b / 10 + b % 10;
        int multi = karatsuba(sum1, sum2);
        multi -= tens + ones;
        return tens * 100 + multi * 10 + ones;
    }
}
