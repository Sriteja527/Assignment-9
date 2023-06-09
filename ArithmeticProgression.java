import java.util.*;
public class ArithmeticProgression {
    public static int findNthTerm(int a, int d, int N) {
        if (N == 1) {
            return a;
        } else {
            return findNthTerm(a + d, d, N - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a1 value:");
        int a1 = sc.nextInt();
        System.out.println("Enter the d1 value:");
        int d1 = sc.nextInt();
        System.out.println("Enter the n1 value:");
        int N1 = sc.nextInt();
        System.out.println("Enter the a2 value:");
        int a2 = sc.nextInt(); 
        System.out.println("Enter the d2 value:");
        int d2 = sc.nextInt(); 
        System.out.println("Enter the n2 value:");
        int N2 = sc.nextInt();

        int nthTerm1 = findNthTerm(a1, d1, N1);
        System.out.println("The " + N1 + "th term of the series is: " + nthTerm1);

        int nthTerm2 = findNthTerm(a2, d2, N2);
        System.out.println("The " + N2 + "th term of the series is: " + nthTerm2);
    }
}
