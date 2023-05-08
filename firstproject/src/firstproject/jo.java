package firstproject;
import java.util.Scanner;
public class jo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name:");
		String name=sc.nextLine();
		switch(name) {
		case "arul":
			System.out.println("arul is a smiley girl");
			break;
		case "aruna":
			System.out.println("aruna is a rowdy girl");
			break;
			
		case "surya":
			System.out.println("surya is a dancing girl");
			break;
		case "dinesh":
			System.out.println("dinesh is a play boy");
			break;
		case "poovu":
			System.out.println("poovu is a singing boy");
			break;
		case "senkottu":
			System.out.println("senkottu is a genious boy");
			break;
		
		default:
			System.out.println("you enter wrong name");
		}
		

	}

}
