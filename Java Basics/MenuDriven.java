import java.util.Scanner;

public class MenuDriven {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 to input marks or 0 to exit:");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter marks (0-100):");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is very Good marks");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is okay as well");
                } else {
                    System.out.println("Invalid marks");
                }
            }

        } while (choice != 0);

        System.out.println("Program Ended");
        
    }
}
