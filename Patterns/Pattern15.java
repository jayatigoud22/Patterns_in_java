/*
  Pattern 15
   *
  * *
 * * *
* * * *
 */
import java.util.Scanner;
public class Pattern15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
        for(int i =1;i<=n;i++){
			int space = n-i;
			for(int j =1;j<=space;j++){
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++){
			System.out.print("* ");	
			}
			System.out.println();
		}
		
	}
}