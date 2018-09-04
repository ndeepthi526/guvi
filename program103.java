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
	  Scanner s = new Scanner(System.in);
        
         str = s.nextLine();
        String result = "";
        char firstChar = str.charAt(0);
        result = result + Character.toUpperCase(firstChar);
        for (int i = 1; i < str.length(); i++) 
	{
            char currentChar = str.charAt(i);
            char previousChar = str.charAt(i - 1);
            if (previousChar == ' ')
	    {
                result = result + Character.toUpperCase(currentChar);
            } else
	    {
                result = result + currentChar;
            }
        }
        System.out.println(result);
     
    }
 
}
