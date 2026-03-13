import java.util.Scanner;

public class Exp3Linear {
    public static int linearSearch(int[] arr,int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
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
        if(linearSearch(arr,target)==-1){
            System.out.println("Target is not present in array \n so Search is unsuccesfull");
        }else{
            System.out.println(linearSearch(arr,target)+" is the location of target ");
        }
        
    }
    
}
