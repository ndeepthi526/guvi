/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,m,i,flag=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(i=1;i<n;i*=k)
		{
		     m=k*i;
			if(n==m)
			{
				flag=1;
				break;
			}
			else
			flag=0;
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
