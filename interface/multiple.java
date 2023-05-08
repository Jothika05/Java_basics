package inter;
interface Transport{
	void ride();
	}
interface Air{
	void safe();
}
interface Road{
	void slow();
}
interface Sea{
	void speed();
}
class Travel implements Transport,Air,Road,Sea{ //multiple inheritance
	public void speed() {
		System.out.println("vehicle is very fast");
		}
	public void slow() {
	
		System.out.println("vehicle is very slow");
	}
	public void safe() {
		System.out.println("vehicle is very  safe");
	}
	public void ride() {
		System.out.println("vehicle is very  safe ride with slow speed");	
	}
}
	public interface multiple {
        public static void main(String args[]){
           Travel t=new Travel();
           t.ride();
           t.speed();
           t.safe();
           t.slow();
           
        		   
        }      		   
	} 
	
	
	

	
	