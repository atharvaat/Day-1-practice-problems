package Day1practiceproblem;

public class checktwostrings {
	 public static void main(String[] args) {
	      String str1 = "string1";
	      String str2 = "string2";
	      String str3 = "string2";
	     
	   
	      boolean retval1 = str2.equals(str1);
	      boolean retval2 = str2.equals(str3);
	     
	    
	      System.out.println("str2 is equal to str1 = " + retval1);
	      System.out.println("str2 is equal to str3 = " + retval2);
	   }
	
}