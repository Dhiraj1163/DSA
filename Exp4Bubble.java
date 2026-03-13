import java.util.Scanner;

public class Exp4Bubble {
    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.print((i+1)+" th pass :- ");
            for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elements use space for separet ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
    }
}
