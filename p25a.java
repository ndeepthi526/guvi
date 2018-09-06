/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has toro be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,j;
		String str;
		String temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		str=s.nextLine();
		String a[]=new String[n];
		for( i=0;i<n;i++)
		{
			a[i]=s.next();
		}
		for(i=0;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(a[j-1].compareTo(a[j])>0)
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
		
				
			
		
	
