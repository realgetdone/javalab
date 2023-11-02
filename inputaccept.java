import java.util.Scanner;

class Expinputaccept {
    public static void main(String[] args) {
        int l, b, area;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter length=");
            l = sc.nextInt();
            System.out.println("Enter breadth=");
            b = sc.nextInt();
            area = l * b;
            System.out.println("Area is= " + area);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input should be an integer. Please try again.");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
