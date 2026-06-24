//package PEP2;
import java.util.*;


public class Reversenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int rev = 0;
        while(x!=0){
            int rem = x%10;
            rev = rev*10 + rem;
            x=x/10;
            System.out.println(rev);
        }
    }
    
}
