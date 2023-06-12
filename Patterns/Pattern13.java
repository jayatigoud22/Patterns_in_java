/*
 Pattern 13 
 1
 2 3
 3 4 5
 4 5 6 7
*/

import java.util.Scanner;
public class Pattern13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		char value = 'A';
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=n;j++){
				System.out.print(value+" ");
				value+=1;
			}
			System.out.println();
		}
	}
}