package com.file;
import java.util.Scanner;
import java.io.*;

public class FileExist
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file path: ");
		String file= sc.nextLine();
		File filepath = new File(file);
		try
		{
			if(filepath.exists())
			{
				System.out.println("File exists");
				boolean read = filepath.setReadable(true);
				if(read == true)
				{
					System.out.println("File is readable:"+filepath.canRead());
				}
				else
				{
					System.out.println("File is writeable:"+filepath.canWrite());
				}
				String s = filepath.toString();
				int index = s.lastIndexOf('.');
				if(index>0)
				{
					String exe = s.substring(index+1);
					System.out.println("The file type : "+ exe);
				}
				System.out.println("The file length: "+filepath.length());
			}
		}
		catch(Exception e)
		{
			System.out.print("File does not exists");
		}
	}
}