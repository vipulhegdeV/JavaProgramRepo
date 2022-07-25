import java.util.Scanner;
public class basic {
	public static void main(String args[])
	{
		stdnt b=new stdnt();
		System.out.println("Name of student 2: "+b.student2);
		System.out.println("Name of student 3: "+b.student3);
		int r=b.student2.length();
		System.out.println("length of Student 2 string is : "+r);
		if(b.y==true)
			System.out.println("True/Yes ");
		else
			System.out.println("False/no ");
		System.out.println("enter string  :");
		Scanner scan=new Scanner(System.in);
	    String ww = scan.next();
	    System.out.println("String entered : "+ww);
	    boolean ew=ww.contains("qwerty");
	    if(ew==true)
	    	System.out.println("yes");
	    else
	    	System.out.println("NO");
		}
}
class stdnt{
	public String student1="SWASTIK";
	public String student2="tommy";
	public String student3="cat";
	public String student4="vipul";
	boolean y=student4.contains("K");
	
}


