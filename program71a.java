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
		int l;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		str=s.next();
		l=str.length();
		for(int i=0;i<l;i++,l--)
		{
			if(str.charAt(i)==str.charAt(l-1))
			{
				flag=true;
				
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
			
		
	}
}
		
	
