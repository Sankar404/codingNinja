import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
        System.out.println("*");
        for(i=1;i<=n;i++){
            System.out.print("*");
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println();
            
        }
        for(i=n-1;i>=1;i--){
            System.out.print("*");
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println();
            
        }
        System.out.print("*");
    }
}
