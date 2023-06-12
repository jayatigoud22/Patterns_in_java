/*
  Pattern 21
          1
	    2 3
	  4 5 6
   7 8 9 10
*/
import java.util.Scanner;
public class Pattern21{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int row=1;
		int val =1;
		while(row<=n){
			int space=n-row;
			for(int i=0;i<space;i++){
				System.out.print(" ");
				
			}
			int col = 1;
			while(col<=row){
				System.out.print(val);
				val++;
				col=col+1;
			}
			System.out.println();
			row++;
		}
		
	}
}