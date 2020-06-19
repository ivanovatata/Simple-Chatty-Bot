import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldLine = scanner.nextLine();
        String newLine = oldLine.replace('a', 'b');
        System.out.println(newLine);
    }
}