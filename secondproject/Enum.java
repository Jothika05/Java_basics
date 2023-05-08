package secondproject;

enum Level{
	FIRST("F"),MIDDLE("M"),LAST("L");
	private String abbr;
	
	Level(String ab){
		abbr=ab;
	}
  public String getAbbr() {
     return abbr;
  }
}
public class Enum {

	public static void main(String[] args) {
    Level l1=Level.MIDDLE;
    Level l2=Level.FIRST;
    Level l3=Level.LAST;
    System.out.println(l1);
    System.out.println("level 1 is "+l1.toString());//similar to l2,l3
    System.out.println("level 1 is "+l1.hashCode());
    System.out.println("level 1 is "+l1.getAbbr());
    System.out.println("level 1 is "+l1.ordinal());
    System.out.println("level 1 is "+l1.getDeclaringClass());
    System.out.println("level 1 is "+l1.describeConstable());
    System.out.println("level 1 is "+l1.compareTo(l3));
	}
}

