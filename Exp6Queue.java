import java.util.Scanner;

class queue{
    private int capacity;
    private int[] q;
    private int start=0,rare=0;
    public queue(int capacity){
        this.capacity=capacity;
        q=new int[capacity];
    }
    public void insert(int element){
        if(rare==capacity){
            System.out.println("queue is overflow");
            return;
        }else{
            System.out.println(element+" is inserted in Queue ");
            q[rare]=element;
            rare=rare+1;
            return;
        }
    }
    public void delet(){
        if(start==rare){
            System.out.println("Queue is in underflow ");
        }else{
            System.out.println("element deleted Succesfully");
            start=start+1;
        }
    }
    public void display(){
        if(start==rare){
            System.out.println("Queue is in underflow ");
        }else{
            for(int i=start;i<rare-1;i++){
                System.out.print(q[i]+"-");
            }
            System.out.print(q[rare-1]);
            System.out.println();
        }
    }
}

public class Exp6Queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Queue : ");
        int capacity=sc.nextInt();
        queue q1=new queue(capacity);
        boolean isRepeat=true;
        
        while (isRepeat) {
            System.out.println("Enter SR no. of choise");
            System.out.println("1. Insert\n2. Delet\n3. Display\n4. Exit");
            int choise=sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("enter Element");
                    int element=sc.nextInt();
                    q1.insert(element);
                    break;
                case 2:
                    q1.delet();
                    break;
                case 3:
                    q1.display();
                    break;
                case 4:
                    isRepeat=false;
            }
        }

        sc.close();
    }
}
