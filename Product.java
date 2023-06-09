import java.util.*;
public class Product{
    Scanner sc = new Scanner(System.in);
    void input(){
        int sum = 1;
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
        sum = sum * arr[i];
        }
        System.out.println("The product of the array is:"+sum);
    }
    public static void main(String... args){
        Product p = new Product();
        p.input();
    }
}