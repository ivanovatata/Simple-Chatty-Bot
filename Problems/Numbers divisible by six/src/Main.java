import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int x = scanner.nextInt();
            if (x % 6 == 0) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}