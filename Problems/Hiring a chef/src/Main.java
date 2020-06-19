import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String candidatesFirstName = scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        String candidatesCuisinePreference = scanner.nextLine();
        System.out.println("The form for " + candidatesFirstName +
                " is completed. We will contact you if we need a chef that cooks " +
                candidatesCuisinePreference + " dishes.");
    }
}