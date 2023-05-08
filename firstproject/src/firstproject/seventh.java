/* **************getting input from user*********************/

package firstproject;
import java.util.Scanner;
public class seventh {
             public static void main(String args[]) {
             Scanner scanner= new Scanner(System.in);
      
    System.out.println("what is your name?");
    
    String name = scanner.nextLine();
    
    System.out.println("what is your rating?");
    
    short rating = scanner.nextShort();
    scanner.nextLine();
    
    
    System.out.println("enter email");
    String email = scanner.nextLine();
    
    
    System.out.println("hello:" + name);
    System.out.println("You rated us:" + rating);
    System.out.println("email:" + email);
    }
}

