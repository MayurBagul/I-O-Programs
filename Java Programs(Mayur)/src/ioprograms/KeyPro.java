package ioprograms;

import java.io.*;
public class KeyPro {

	public static void main(String[] args) throws Exception
	{
		File f=new File("C:/Users/Admin/Desktop/Keys.txt");
		
		FileReader fr=new FileReader(f);
		
		BufferedReader bf=new BufferedReader(fr);
		
		char[] c=new char[20];
		
		String s[]=new String[20];
		
		int j=0,i=0;
		
		
		
		for(j=0;((s[j]=bf.readLine())!=null);j++)
		{
			s[j]=bf.readLine();
				
		}
		
		
		
		
		
		j=0;
		
		for(i=0;i<s.length;i++)
		{
			for(j=0;j<s.length;j++)
			
			c[j]=s[i].charAt(j);
			
		}
		
	
		
		
		bf.close();
		fr.close();

	}

}
