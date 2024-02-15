import java.util.Scanner;

public class IndexProduct {
    public int[] productSkipIndex(int[] arr){
        int[] newArr=new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int prod=1;
            for(int j = 0; j < arr.length; j++){
                if(j!=i){
                    prod*=arr[j];
                }
            }
            newArr[i]=prod;
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IndexProduct obj = new IndexProduct();
        System.out.print("Enter no of elements in arr: ");
        int n=scanner.nextInt();
        System.out.println();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("enter elements of arr: ");
            arr[i] = scanner.nextInt();
            System.out.println();
        }
//        System.out.println(obj.productSkipIndex(arr));
        int[] newArr = obj.productSkipIndex(arr);
        for(int i=0; i < newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
