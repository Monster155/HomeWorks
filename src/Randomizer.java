import java.util.Scanner;

public class Randomizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int scale = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print((int) (Math.random() * scale) + ",");
        }
    }
}
