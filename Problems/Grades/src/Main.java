import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        for (int i = 0; i < num; i++) {
            int x = scanner.nextInt();
            if (x == 5) {
                a++;
            } else if (x == 4) {
                b++;
            } else if (x == 3) {
                c++;
            } else if (x == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c  + " " + b + " " + a);
    }
}