/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int m,n,i,j,temp=0;
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		int a[]=new int[m];
		int b[]=new int[n];
		int c[]=new int[50];
		for(i=0;i<m;i++)
		{
			a[i]=s.nextInt();
			c[i]=a[i];
		}
		for(i=0;i<n;i++)
		{
			b[i]=s.nextInt();
			c[i+m]=b[i];
		}
		for(i=0;i<(m+n);i++)
		{
			for(j=i+1;j<(m+n);j++)
			{
				if(c[i]>c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(i=0;i<(m+n);i++)
		{
			System.out.println(c[i]+" ");
		}
	}
}
