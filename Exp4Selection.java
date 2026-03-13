import java.util.Scanner;

public class Exp4Selection {
    public static void selectionSort(int[] arr) {
        int i, j;
        for (i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (j = i; j < arr.length ; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            System.out.print((i + 1) + " th pass :- ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements use space for separet ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        sc.close();
    }
}
