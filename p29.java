/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int l,k,i,count=0,a;
		Scanner s=new Scanner(System.in);
		l=s.nextInt();
		k=s.nextInt();
		for(i=l;i<=k;i++)
		{
			a=i*i;
			if(a<=k)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
		
			
		
		
	
