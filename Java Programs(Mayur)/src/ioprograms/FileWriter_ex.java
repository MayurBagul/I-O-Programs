package ioprograms;

import java.io.*;
import java.io.IOException;

public class FileWriter_ex 
{
	public void writeString()
	{
		try
		{
		FileWriter f=new FileWriter("c.txt");
		
		f.write("Hello there! this is new file");
		System.out.println("Sucessfully written");
		f.close();
		
		}
		catch(IOException e)
		{
			System.out.println("Success");
		}
		
	}
	
	public void readString()
	{
		try
		{
		FileReader f=new FileReader("c.txt");
		
		int i=0;
		
		while((i=f.read())!=-1)
		{
		System.out.print((char)i);
		}	
		f.close();
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	

	public static void main(String[] args) 
	{
		FileWriter_ex f=new FileWriter_ex();
		
		f.writeString();
		f.readString();
		
	}

}
