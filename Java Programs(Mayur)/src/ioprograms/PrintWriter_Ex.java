package ioprograms;

import java.io.*;


public class PrintWriter_Ex 
{
	public void writeString()
	{
		try
		{
		OutputStream f=new FileOutputStream("abc.txt");
		PrintStream p=new PrintStream(f);
		p.print("Hello Mayur! ");
		p.println("Your in Class PrintWriter !");
		System.out.println("Success?");
		p.close();
		f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	

	public static void main(String[] args) 
	{
		PrintWriter_Ex f=new PrintWriter_Ex();
		f.writeString();
	}

}
