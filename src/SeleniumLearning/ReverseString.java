package SeleniumLearning;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String value = sc.nextLine();
		
		String reversedvalue= reverse(value);
		System.out.println("Reverse String Method 1 + By using character wise iteration");
		System.out.println(reversedvalue);
		
		System.out.println("Checking for Entered String is Palindrome or not");
		if(value.equals(reversedvalue))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
			/*	You can use method reverse only for string Buffer & String Builder
			 * 
			 */
			System.out.println("Reverse String Method 2 + Using String Buffer" );
			StringBuffer s = new StringBuffer(value);
			System.out.println(s.reverse());
			
			/*
			 *	U can convert the reversed string value and then store in new String 
			 */
			System.out.println("Reverse String Method 3 + Using String Buffer and String ");
			String stringreverse= new StringBuffer(value).reverse().toString();
			System.out.println(stringreverse);
			
			
			System.out.println("Reverse String Method 4 + Using StringBuilder Buffer");
			StringBuilder s1= new StringBuilder(value);
			System.out.println(s1.reverse());
			
			System.out.println("Reverse String Method 5 + Using String Builder and String ");
			String stringreverse2= new StringBuilder(value).reverse().toString();
			System.out.println(stringreverse2);
			
					
			System.out.println("Reverse String Method 6 + converting string into char array");
			char[] chararrayString= value.toCharArray();
			System.out.println(chararrayString);
			for(int k=chararrayString.length-1; k>=0;k--)
				System.out.print(chararrayString[k]);
			
			
			System.out.println("Reverse String Method 7 + converting string into char array by swapping method");
				char temp;
				int length= chararrayString.length;
				System.out.println(length);
				int index=0;
				while(index!=length)
				{
					System.out.println("Index value is "+index+" length value is "+length);
					
					temp =chararrayString[length-1];
					chararrayString[length-1]=chararrayString[index];
					chararrayString[index]=temp;
							
					index++;
					length--;
				}
				System.out.println(chararrayString);
	}
	
	public static String reverse(String str)
	{
		/*
		 * Iterate through index
		 
		for(int i=0; i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}
		*/
		
		/*
		 * Print the reverse 
		 */
		String reversedText="";
		for(int j=str.length()-1;j>-1;j--)
		{
			
			 reversedText= reversedText+str.charAt(j);
			//System.out.print(str.charAt(j));
			}
		return reversedText;
	}

}
