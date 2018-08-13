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
		int count=0,ch=0,digit=0,t=0;
		Scanner s=new Scanner(System.in);
		str=s.next();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				digit++;
			}
			else if((str.charAt(i)>='a'&& str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
			{
				ch++;
			}
			else if(str.charAt(i)=='_')
			{
				t++;
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
