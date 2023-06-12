/* 
 Pattern 22
          1
		1 2 1
	  1 2 3 2 1
    1 2 3 4 3 2 1
 */
import java.util.Scanner;
public class Pattern22{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int row=1;
	while(row<=n){
		int j=1, space= 1;
		while(space<=n-row){
			System.out.print(" ");
			space=space+1;
		}
		while(j<=row){
			System.out.print(j+" ");
			j++;
		}
		j=row-1;
		
		while(j>=1){
			System.out.print(j+" ");
			j=j-1;
		}
		row++;
		System.out.println();
	  }
		
	}
}