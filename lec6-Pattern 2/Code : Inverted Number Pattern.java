import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

		int i=1;
        while(i<=n){
            int j=n-i+1;
            int p=j;
            while(j>0){
                System.out.print(p);
                j--;
            }
            System.out.println();
            i++;

        }
	}

}
