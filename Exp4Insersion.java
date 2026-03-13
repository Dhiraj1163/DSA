import java.util.Scanner;

public class Exp4Insersion {
     public static void insersionSort(int[] arr) {
        int i,j;
        for( i=1;i<arr.length;i++){
            int temp=arr[i];
            for(j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }arr[j+1]=temp;
            System.out.print((i)+" th pass :- ");
            for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
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
        insersionSort(arr);

        sc.close();
    }
}
