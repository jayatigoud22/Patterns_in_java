/*
  Pattern 18
  1 1 1 1
    2 2 2
	  3 3
	    4
*/
import java.util.Scanner;
public class Pattern18{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=n-i;k++){
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}