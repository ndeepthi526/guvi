/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int h1,h2,m1,m2,d,h3,h4;
		Scanner s=new Scanner(System.in);
		h1=s.nextInt();
		m1=s.nextInt();
		h2 =s.nextInt();
		m2=s.nextInt();
		h3=h1*60+m1;
		h4=h2*60+m2;
		d=h3-h4;
		if(d>60)
		{
			h3=d/60;
			h4=d%60;
			System.out.println(h3+ " " +h4);
		}
		else
		{
			System.out.println(d);
		}
	}
}
		
	
		
		
			
		
	
