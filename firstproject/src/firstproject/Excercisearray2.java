package firstproject;
import java.util.Scanner;

public class Excercisearray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		int count=sc.nextInt(); 
		
		int[] total=new int [count];
		for(int i=0;i<count;i++) {
			System.out.println("enter the number:");
			total[i]=sc.nextInt();
		}
		for(int i=0;i<count;i++)
 			System.out.println(total[i]);
   int sum=0;
   for(int i=0;i<count;i++) {
   sum=sum+total[i];
   }
   System.out.println(sum);
	
	}
}