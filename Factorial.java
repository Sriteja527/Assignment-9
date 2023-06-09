import java.util.*;
public class Factorial{
    Scanner sc = new Scanner(System.in);
    void input(){
        int fact = 1;
System.out.println("Enter the number to find factorial:");
int n = sc.nextInt();
for(int i=n;i>0;i--){
    fact = fact * i;
}
System.out.println("The factorial of given number is:"+fact);
    }
    public static void main(String[] args){
        Factorial f = new Factorial();
        f.input();
    }
}