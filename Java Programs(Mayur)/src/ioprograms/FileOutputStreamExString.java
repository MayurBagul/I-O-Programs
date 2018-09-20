package ioprograms;
import java.io.*;

public class FileOutputStreamExString {


	public static void main(String[] args) 
	{
		
		try
		{
		FileOutputStream f=new FileOutputStream("abc.txt");
		String s="Hello Mayur !";
		
		byte i[]=s.getBytes();
		
		f.write(i);
		
		f.close();
		
		System.out.println("Successfully Writed in File");
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
