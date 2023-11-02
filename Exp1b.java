public class Exp1b { //array elements find
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 60, 25};
        int key = 60;
        int i = 0;
        int flag = 0;

        System.out.println("Array elements are: ");
        for (int element : a) {
            System.out.println(element);
            if (element == key) {
                flag = 1;
                break;
            }
            i++;
        }

        if (flag == 1) {
            System.out.println("Key found at index: " + i);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
