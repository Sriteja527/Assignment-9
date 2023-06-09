import java.util.*;
public class MaximumElementRecursion {
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            int max = findMax(arr, index + 1);
            return Math.max(arr[index], max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array is:");
        int size1 = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr1 = new int[size1];
        for(int i=0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array is:");
        int size2 = sc.nextInt();
          System.out.println("Enter the array elements:");
        int[] arr2 = new int[size2];
        for(int i=0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }

        int max1 = findMax(arr1, 0);
        System.out.println("Maximum element in arr1: " + max1);

        int max2 = findMax(arr2, 0);
        System.out.println("Maximum element in arr2: " + max2);
    }
}
