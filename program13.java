/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int num,i;
	   int count;
	   count=0;
	   Scanner s=new Scanner(System.in);
	   num=s.nextInt();
	   for(i=2;i<num;i++)
	   {
	   	if(num%i==0)
	   	{
	   		count++;
	   	}
	   }
	   if(count==0)
	   {
	   	System.out.println("yes");
	   }
	   else
	   {
	   	System.out.println("no");
	   }
	   }
	   }
	   
	
