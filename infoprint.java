import java.util.InputMismatchException;
import java.util.Scanner;

public class infoprint {
    long sid, mobno;
    String name;
    String email;
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.println("\nEnter Student's name: ");
        name = sc.nextLine();

        System.out.println("\nEnter Email: ");
        email = sc.nextLine();
        try {
            System.out.println("\nEnter Student ID: ");
            sid = sc.nextLong();
            System.out.println("\nEnter Mobile No.: ");
            mobno = sc.nextLong();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
        }
    }

    void display() {
        System.out.println("\nStudent's details are:-\n");
        System.out.println("Name: " + name + "\nID: " + sid + "\nMobile no.: " + mobno + "\nEmail ID: " + email);
    }

    public static void main(String args[]) {
        infoprint s1 = new infoprint();
        s1.getData();
        s1.display();
    }
}

