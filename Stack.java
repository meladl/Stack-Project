
import java.util.Scanner;
class Stack{
   private int maxSize;        
   private long[] stackArray;
   private int top;            

   public Stack(int s){
      maxSize = s;            
      stackArray = new long[maxSize];  
      top = -1;               
      }

   public void push(long j){
      stackArray[++top] = j;     
      }

   public long pop(){
      return stackArray[top--];  
      }

   public long peek(){
      return stackArray[top];
      }

   public boolean isEmpty(){
      return (top == -1);
      }

   public boolean isFull(){
      return (top == maxSize-1);
      }
   public void display(){
       for(int i = this.top; i >= 0; i--){
           System.out.print(" " + this.stackArray[i]);
       }
   }
   
   public static void removeDownTo(Stack stack, long n){  
     System.out.print("The Input Stack is: ");
       stack.display();
       while(!stack.isEmpty()){
         long peekVal = stack.peek();
         if(peekVal== n){
             break;
         }
         else stack.pop();
     }
       System.out.println("");
       System.out.print("The Output Stack is: ");
       while( !stack.isEmpty() ){                     
       long outputValue = stack.pop();
       System.out.print(outputValue);     
       System.out.print(" ");
       }
       
   }
       
   
   
////////////////////////////////////////////////////////////////

   public static void main(String[] args){
      Stack theStack = new Stack(10);  
      theStack.push(20);              
      theStack.push(40);
      theStack.push(60);
      theStack.push(80);
      System.out.println("");
     
       removeDownTo(theStack, 20);
      
      
     
   }
}
   


