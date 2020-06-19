import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int cntBridges = scanner.nextInt();
        int heightBridge;
        for (int i = 1; i <= cntBridges; i++) {
            heightBridge = scanner.nextInt();
            if (heightBridge <= height) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (i == cntBridges) {
                System.out.println("Will not crash");
            }
        }

    }
}