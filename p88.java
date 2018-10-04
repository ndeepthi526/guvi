/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,d=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		d=n>>k;
		System.out.println("%.2f",d);
		
		
	}
}
