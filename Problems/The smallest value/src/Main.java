import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int n = 1;
        long nFact = 1L;
        while (nFact <= m) {
            n++;
            nFact *= n;
        }
        System.out.println(n);
    }
}