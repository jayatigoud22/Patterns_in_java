/*
  Pattern 11
  A B C
  A B C
  A B C
*/

import java.util.Scanner;
public class Pattern11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++){
		   char val = 'A';
			for(int j = 1;j<=n;j++){
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}
	}
}