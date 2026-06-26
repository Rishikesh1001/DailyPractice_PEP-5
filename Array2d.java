import java.util.*;
public class Array2d{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int row= sc.nextInt();
        int coulmn = sc.nextInt();
        int arr[][] = new int[row][coulmn];
        for (int i=0; i<row; i++){
            for (int j=0; j<coulmn; j++){
            arr[i][j]=sc.nextInt();
            }
        }
        int target = sc.nextInt();
        boolean found = false;

        for (int i=0; i<row; i++){
            for(int j=0; j<coulmn; j++){
                if(arr[i][j]==target){
                    System.out.println(i +", "+j);
                    found = true;
                    break;
                }
                
            }
        }
        if(!found){
                    System.out.println("Not in array");
                    
                }
    }
}