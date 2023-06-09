import java.util.*;
public class Power{
    Scanner sc = new Scanner(System.in);
    void input(){
        int x = 0;
        int y = 0;
        System.out.println("enter the number:");
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
        x = 2 * i;
        if(n == x){
            System.out.println("true");


        }
        }
    }
    public static void main(String[] args){
        Power p = new Power();
        p.input();
    }
}