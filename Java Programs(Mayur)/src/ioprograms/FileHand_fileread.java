package ioprograms;
import java.io.*;
public class FileHand_fileread 
{

	void readByte()
	{
		try
		{
			FileInputStream f=new FileInputStream("abc.txt");
			int i=f.read();
			System.out.println((char)i);
		
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	
	void readString()
	{
		try
		{
			FileInputStream f=new FileInputStream("abc.txt");
			int i=0;
			
			while((i=f.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			f.close();
		}
		catch(IOException e)
		{
			System.out.print(e);
		}
	}
	
	
	public static void main(String[] args) 
	{
		FileHand_fileread fi=new FileHand_fileread();
		fi.readString();
	}

}
