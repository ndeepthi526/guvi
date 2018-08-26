/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n1,n2,n3,sur=0,vol=0;
	    Scanner s=new Scanner(System.in);
	    n1=s.nextInt();
	    n2=s.nextInt();
	    n3=s.nextInt();
	    sur=2*((n1*n2)+(n2*n3)+(n3*n1));
	    vol=n1*n2*n3;
	    System.out.println(sur);
	    System.out.println(vol);
	    
	}
}
