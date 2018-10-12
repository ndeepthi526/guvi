/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,decimal=0,base=1,r;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			decimal=decimal+r*base;
			n=n/10;
			base=base*2;
			
		}
		System.out.println(decimal);
		
	}
}
