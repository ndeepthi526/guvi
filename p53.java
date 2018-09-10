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
		int count=0,i;
		Scanner s=new Scanner(System.in);
		str=s.next();
		str=str+'\0';
		for(i=0;str.charAt(i)!='\0';i++)
		count++;
		   
		
		System.out.println(count);
		
	}
}
