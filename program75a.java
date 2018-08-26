import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str;
		int l,i,b;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		l=str.length();
		char a[]=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
		if(str.charAt(i)%2==0)
		{
			b=str.length()/2;
			a[b-1]='*';
			a[b]='*';
			for(i=0;i<str.length();i++)
			System.out.println(a[i]);
		}
		else
		{
			b=str.length()/2;
			a[b]='*';
			for(i=0;i<str.length();i++)
			System.out.println(a[i]);
		}
			}
			
			
		}
		}
		
