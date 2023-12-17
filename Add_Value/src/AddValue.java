import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to insert: ");
        int valueToInsert = scanner.nextInt();
        System.out.print("Enter the position to insert: ");
        int insertPosition = scanner.nextInt();

        if (insertPosition < 0 || insertPosition > n) {
            System.out.println("Invalid position. Please try again.");
        } else {
            array = insertValue(array, valueToInsert, insertPosition);

            // Display the array after insertion
            System.out.println("Array after inserting the value:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int[] insertValue(int[] array, int value, int position) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        newArray[position] = value;
        for (int i = position + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        return newArray;
    }
}
