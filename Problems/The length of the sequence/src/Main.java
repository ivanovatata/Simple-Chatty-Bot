import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int len = 0;
        while (num != 0) {
            len++;
            num = scanner.nextInt();
        }
        System.out.println(len);
    }
}