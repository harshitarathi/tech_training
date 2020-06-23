package Day14;
import java.util.*;
public class myStack {   
 int arr[] = new int[5];   
 int top = -1;   
  
 public void push(int pushedElement) {   
  if (top < 5 - 1) {   
   top++;   
   arr[top] = pushedElement;      
   
  } else {   
   System.out.println("Stack Overflow !");   
  }   
 }   
  
 public void pop() {   
  if (top >= 0) {
  System.out.println("Item popped is:"+arr[top]);  
   top--;   
      
  } else {   
   System.out.println("Stack Underflow !");   
  }   
 }   
  
 public void printElements() {   
  if (top >= 0) {   
   System.out.println("Elements in stack :");   
   for (int i = 0; i <= top; i++) {   
    System.out.println(arr[i]);   
   }   
  }   
 }   
  
 public static void main(String[] args) {   
	 myStack stack = new myStack();   
  
	 System.out.println("Enter element to push:");
	 Scanner sc=new Scanner(System.in);
	 for(int i=0;i<5;i++)
	 {
		 int item=sc.nextInt();
		 stack.push(item);
	 }
	 stack.printElements();
	 for(int i=0;i<5;i++)
	 {
		 stack.pop();
	 }
  } 
  
}  


