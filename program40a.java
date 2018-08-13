/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int n,i;
		int a=1,b=1,c;
		System.out.println(a+"\t");
		System.out.println(b+"\t");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=3;i<=n;i++)
		{
			c=a+b;
			
			System.out.println(c+"\t");
			a=b;
			b=c;
			
		}
	}
}
		
		
	

	
