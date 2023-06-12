/*
  Pattern 14 
  A B C
  B C D
  C D E
*/
 import java.util.Scanner;
public class Pattern14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++){
		    char value = (char)('A'+i-1);
			for(int j = 1;j<=n;j++){
				System.out.print(value+" ");
				value+=1;
			}
			System.out.println();
		}
	}
}