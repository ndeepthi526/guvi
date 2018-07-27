/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
       public static void main (String[] args) throws java.lang.Exception
	{
		int i,n,k,r;
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		k=S.nextInt();
		r=n;
		for(i=1;i<k;i++)
		{
			r=r*n;
		}
		System.out.println(r);
		
	}
}
