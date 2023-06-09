import java.util.*;
public class Natural{
    Scanner sc = new Scanner(System.in);
    void input(){
        int sum = 0;
System.out.println("Enter the number:");
int n = sc.nextInt();
for(int i=n;i>0;i--){
sum = sum + i;
}
System.out.println("The sum of the first n natural numbers is:"+sum);
    }
    public static void main(String... args){
        Natural n = new Natural();
        n.input();
    }
}