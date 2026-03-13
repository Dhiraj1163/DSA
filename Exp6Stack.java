import java.util.Scanner;
class Stack {
   private int capacity;
   private int[] s;
   private int top = 0;

   public Stack(int capacity) {
      this.capacity = capacity;
      s = new int[capacity];
   }

   public void push(int element) {
      if (top == capacity) {
         System.out.println("Stack is overflow");
      } else {
         System.out.println(element + " is inserted in Stack ");
         s[top] = element;
         top=top+1;
      }
   }

   public void pop() {
      if (top == 0) {
         System.out.println("Stack is in underflow ");
      } else {
         System.out.println("element removed Succesfully");
         top=top-1;
      }

   }

   public void display() {
      if (top == 0) {
         System.out.println("Stack is in underflow ");
      } else {
         for(int i = 0; i <top - 1; i++) {
            System.out.print(s[i] + "-");
         }
         System.out.print(s[top - 1]);
         System.out.println();
      }

   }

   public void peek() {
      if (top == 0) {
         System.out.println("Stack is in empty ");
      } else {
         
         System.out.println(s[top-1] + " is on the peek ");
      }

   }

   public void isEmpty() {
      if (top == 0) {
         System.out.println("Stack is in empty ");
      } else {
         System.out.println("Stack is not empty");
      }

   }
}
public class Exp6Stack {
   public Exp6Stack() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Size of Stack : ");
      int size = sc.nextInt();
      Stack s1 = new Stack(size);
      boolean isRepeat = true;

      while(isRepeat) {
         System.out.println("Enter SR no. of choise");
         System.out.println("1. Push\n2. pop\n3. Display\n4. peek\n5. is empty\n6. Exit");
         int choise = sc.nextInt();
         switch (choise) {
            case 1:
               System.out.println("enter Element");
               int element = sc.nextInt();
               s1.push(element);
               break;
            case 2:
               s1.pop();
               break;
            case 3:
               s1.display();
               break;
            case 4:
               s1.peek();
               break;
            case 5:
               s1.isEmpty();
               break;
            case 6:
               isRepeat = false;
         }
      }
      sc.close();  
   }
}
