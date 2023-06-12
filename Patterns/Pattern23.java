/*
Pattern 23

1 2 3 4 5 5 4 3 2 1 
1 2 3 4 * * 4 3 2 1
1 2 3 * * * * 3 2 1
1 2 * * * * * * 2 1
1 * * * * * * * * 1 

*/
import java.util.Scanner;
public class Pattern23{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n-i+1){
				System.out.print(j +" ");
				j++;
			}
			
			j=1;
			while(j<=(i-1)*2){
				System.out.print("* ");
				j++;			
			}
			j=n-i+1;
			while(j>=1){
				System.out.print(j+" ");
				j=j-1;
			}
			i=i+1;
			System.out.println();
		}
		
	}
}