import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int numOfDays = 1;
        while ((a * numOfDays - b * (numOfDays - 1)) < h) {
            numOfDays += 1;
        }
        System.out.println(numOfDays);
    }
}
