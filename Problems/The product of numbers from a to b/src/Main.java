import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long dev = 1;
        for (; a < b; a++) {
            dev *= a;
        }
        System.out.println(dev);
    }
}