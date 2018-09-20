package ioprograms;
import java.io.*;
public class FileHand_BuffOut 
{

	void writeString()
	{
		try
		{
			FileOutputStream f=new FileOutputStream("abc.txt");
			BufferedOutputStream bf=new BufferedOutputStream(f);
			
			String s="This is File of Mayur Bagul !";
			
			byte b[]=s.getBytes();
			
			bf.write(b);
			bf.close();
			System.out.println("File has benn written successfully");

		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	
	
	public void readByte()
	{
		try
		{
			FileInputStream f=new FileInputStream("abc.txt");
			
			BufferedInputStream bf=new BufferedInputStream(f);
			
			int i=0;
			
			while((i=bf.read())!=-1)
			{
				System.out.print((char)i);
			}
			
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
		FileHand_BuffOut f=new FileHand_BuffOut();
		f.readByte();
	}

}
