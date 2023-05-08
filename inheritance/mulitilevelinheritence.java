package inheritance;
	   /*multilevel inheritance */
	class Grandfather{
	  void agri() 
	  {
	    System.out.println("Agriculture");
	   }
	}
	 class Father extends Grandfather{
	    void teacher()
	    {
	      System.out.println("teaching");
	    }
	 }
	 class Grandson extends Father{
	     void engineer() 
	     {
	       System.out.println("engineering");
	     }
	 }
	 public class  mulitilevelinheritence {
	      public static void main(String[] args) {
	    // TODO Auto-generated method stub
	       Grandson g=new Grandson();
	       g.agri();
	       g.teacher();
	       g.engineer();
	       System.out.println(" father and grandson are educated family");
	  
	      }

	}


