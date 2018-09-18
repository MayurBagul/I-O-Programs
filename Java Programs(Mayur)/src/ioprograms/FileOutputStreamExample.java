package ioprograms;
import java.io.*;

public class FileOutputStreamExample 
{

	public static void main(String args[])
	{
		try
		{
			
		FileOutputStream f=new FileOutputStream("abc.txt"); 
		f.write(65);
		f.close();
		System.out.println("Successfully Writed in File");
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
	
	}
	
}
