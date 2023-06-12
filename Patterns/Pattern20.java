/*
  Pattern 20
         
		 1
       2 2
     3 3 3	
   4 4 4 4	 
	  
*/
import java.util.Scanner;
public class Pattern20{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int row=1;
		while(row<=n){
			int space=n-row;
			for(int i=0;i<space;i++){
				System.out.print(" ");
				
			}
			int col = 1;
			while(col<=row){
				System.out.print(row);
				col=col+1;
			}
			System.out.println();
			row++;
		}
		
	}
}