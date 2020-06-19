import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i && cnt < num; j++) {
                System.out.print(i + " ");
                cnt++;
            }
        }
    }
}