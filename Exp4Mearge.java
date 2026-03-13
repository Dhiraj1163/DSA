import java.util.Scanner;

public class Exp4Mearge {
    public static void meargeSort(int arr[],int si,int ei){
        //base case
        if (si>=ei) {
            
            return;
        }
        int mid=(si+ei)/2;
        meargeSort(arr, si, mid);
        meargeSort(arr, mid+1, ei);

        mearge(arr,si,ei,mid);
    }

    public static void mearge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i=si,j=mid+1;
        int idx=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[idx]=arr[i];
                i++;
            }else{
                temp[idx]=arr[j];
                j++;
            }
            idx++;
        }
        while(i<=mid){
            temp[idx++]=arr[i++];
        }
        while (j<=ei) {
            temp[idx++]=arr[j++];
        }

        for(i=si,j=0;i<=ei;i++,j++){
            arr[i]=temp[j];
        }
    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
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
        meargeSort(arr,0,arr.length-1);
        display(arr);
        sc.close();
    }
}
