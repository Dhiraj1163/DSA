import java.util.Scanner;

public class Exp3Binary {
    public static int binarySearch(int[] arr,int target){
        int si=0;
        int ei=arr.length-1;
        while (si<=ei) {
            int mid=(si+ei)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }
        return -1;
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

        System.out.print("Enter Target element :");
        int target=sc.nextInt();

        if(binarySearch(arr,target)==-1){
            System.out.println("Target is not present in array \n so Search is unsuccesfull");
        }else{
            System.out.println(binarySearch(arr,target)+" is the location of target ");
        }
        System.out.println();
    }
}
