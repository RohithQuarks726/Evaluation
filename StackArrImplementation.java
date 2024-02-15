import java.util.Arrays;
import java.util.Scanner;

public class StackArrImplementation {
    int[] arr;
    int max;

    public StackArrImplementation(int[] arr, int max){
        this.arr = arr;
        this.max = max;
    }
    public void push(int n){
        if(isFull()){
            System.out.println("Element not added");
            return;
        }
        int[] newArr = new int[arr.length+1];
        for(int i = 0; i<arr.length; i++ ){
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=n;
        arr = newArr;
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
           newArr[i] = arr[i];
        }
        int pop = arr[arr.length-1];
        arr = newArr;
        return pop;
    }
    public boolean isEmpty(){
        if(arr.length==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(arr.length==max){
            return true;
        }
        return false;
    }
    public int peek(){
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max length of stack: ");
        int n = scanner.nextInt();
        System.out.println();
        int[] arr = new int[0];
        StackArrImplementation stackObj = new StackArrImplementation(arr,n);
        boolean again = true;
        System.out.println("Menu:- \n \t1.Push. \n \t2.Pop. \n \t3.Peek. \n \t4.Is empty? \n \t5.Is full? \n \t6.Terminate.");
        while(again) {
            System.out.println("Enter num corresponding to choice to proceed: ");
            int ch = scanner.nextInt();
            if(ch == 1){
                System.out.print("Enter num to push: ");
                int num = scanner.nextInt();
                stackObj.push(num);
            } else if (ch == 2) {
                int num = stackObj.pop();
                if(num>0) {
                    System.out.println("The popped element: " + num);
                } else{
                    System.out.println("No element to pop.");
                }
            } else if (ch == 3) {
                System.out.println("The top element in stack is: "+stackObj.peek());
            } else if (ch == 4) {
                if (stackObj.isEmpty()){
                    System.out.println("Array is empty");
                } else {
                    System.out.println("Array isn't empty");
                }
            } else if (ch == 5) {
                if (stackObj.isFull()){
                    System.out.println("Array is full");
                } else {
                    System.out.println("Array isn't full");
                }
            } else if (ch == 6) {
                System.out.println("Terminating.");
                again=false;
            } else {
                System.out.println("Invalid choice! \n Try again.");
            }
        }
    }
}