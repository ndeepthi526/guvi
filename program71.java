/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str;
		int l,f=0;
		Scanner s=new Scanner(System.in);
		str=s.next();
		l=str.length();
		for(int i=0;i<str.length();i++,l--)
		{
			if(str.charAt(i)==str.charAt(l-1))
			{
				f=1;
				
			}
		}
		if(f==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
			
	
