/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,a,b,c,d;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=(n/10)*10;
		b=n+10;
		c=n-a;
		d=b-n;
		if(c>d)
		{
			System.out.println(d);
		}
		else
		{
			System.out.println(c);
		}
	}
}
