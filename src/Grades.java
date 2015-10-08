
import java.util.Scanner;
public class Grades
{
	public static void main(String[] args)
	{
		double maths,english,hindi,science,ss,total,percentage;
		Scanner in = new Scanner(System.in);
		 
	      System.out.println("Enter maths score");
	      maths = in.nextInt();
	      System.out.println("Enter english score");
	      english = in.nextInt();
	      System.out.println("Enter hindi score");
	      hindi = in.nextInt();
	      System.out.println("Enter science score");
	      science = in.nextInt();
	      System.out.println("Enter ss score");
	      ss = in.nextInt();
	      
	      total=maths+english+hindi+science+ss;
	      percentage=(total/500)*100;
	      
	      if(percentage<40)
	      {
	    	  System.out.println("Poor");
	      }
	      else if(percentage>40||percentage<59)
	      {
	    	  System.out.println("Average");
	      }
	      else if(percentage>60||percentage<79)
	      {
	    	  System.out.println("Good");
	    	  
	      }
	      else if(percentage>80||percentage<89)
	      {
	    	  System.out.println("Very Good");
	    	  
	      }
	      else if(percentage>90||percentage<100)
	      {
	    	  System.out.println("Excellent");
	    	  
	      }
	      
	     
	      
	}
	

}
