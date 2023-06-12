/*
  Pattern 12
  A A A
  B B B
  C C C
  
*/

import java.util.Scanner;
public class Pattern12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++){
		    char val = 'A';
			 val+=i-1;
			for(int j = 1;j<=n;j++){
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}