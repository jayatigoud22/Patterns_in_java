/*
Pattern 5
  4 3 2 1
  4 3 2 1
  4 3 2 1
  4 3 2 1
*/

import java.util.Scanner;
public class Pattern5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++){
			for(int j = n;j>0;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}