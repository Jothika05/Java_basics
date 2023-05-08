package firstproject;

public class Numberpattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int count=1;
		  
	    
	    for(int i=1;i<=4;i++) 
		{
	 		for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++,count++) 
				 System.out.print(count+ " ");
		    System.out.println();
	    }
	}

	}


