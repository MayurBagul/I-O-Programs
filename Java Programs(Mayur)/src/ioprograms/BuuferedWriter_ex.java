package ioprograms;
import java.io.*;

public class BuuferedWriter_ex 
{
	public void writeString()
	{
		try
		{
		FileWriter f=new FileWriter("c.txt");
		BufferedWriter bf=new BufferedWriter(f);
		
		bf.write("Hello Mayur Welcome To class Buffered Writer");
		
		bf.close();
		f.close();
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	
	public void readString()
	{
		try
		{
		FileReader f=new FileReader("c.txt");
		BufferedReader bf=new BufferedReader(f);
		
		int i=0;
		
		while((i=bf.read())!=-1)
			System.out.print((char)i);
		
		bf.close();
		f.close();
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	
	}

	public static void main(String[] args) 
	{
		BuuferedWriter_ex f=new BuuferedWriter_ex();
		
		f.writeString();
		f.readString();
		

	}

}
