package firstproject;
import java.util.Scanner;
public class Excercisearray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] mark= {65,68,100,99,67};
       int max=0;
      for(int i=0;i<mark.length;i++){
    	   if(mark[i]>max) // if(mark[i]<=min)
               max= mark[i];
             }
        System.out.println(max);
    	   

	}

}
