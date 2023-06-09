import java.util.*;
public class SecondPower{
    Scanner sc = new Scanner(System.in);
    void input(){
        int result = 1;
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the power of the number:");
        int power = sc.nextInt();
        for(int i=power;i>0;i--){
        result = result * n;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        SecondPower s = new SecondPower();
        s.input();
    }
}