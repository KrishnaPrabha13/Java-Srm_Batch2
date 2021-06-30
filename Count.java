package com.count;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Count 
{
	public static void main(String [] args) 
	{
		int countword = 0, countchar = 0, countvowel =0;
		try
		{
			File filepath = new File("F:\\Prabha\\Hello.txt");
			BufferedReader b = new BufferedReader(new FileReader(filepath));
			
			String s;
			while((s = b.readLine())!= null)
			{
				for(int i =0;i<s.length();i++)
				{
					char s2 =s.charAt(i);
					if(s2 == 'a'|| s2 == 'e'|| s2 == 'i' || s2 == 'o' ||s2== 'u'||s2=='A'||s2 =='e' ||s2== 'I'||s2=='O'||s2=='U')
					{
						countvowel++;
					}
					else if(s2 ==' ')
					{
						countword++;	
					}
					else
					{
						countchar++;
					}
				}
			}
			System.out.println("The character count = "+countchar);
			System.out.println("The word count = "+countword);
			System.out.println("The vowel count = "+countvowel);
		}
		catch (Exception e)
		{
			System.out.println("file does not exists");
		}
	}
}
