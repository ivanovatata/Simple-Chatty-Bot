import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean res1 = a + b == 20;
        boolean res2 = a + c == 20;
        boolean res3 = b + c == 20;
        System.out.println(res1 || res2 || res3);
    }
}