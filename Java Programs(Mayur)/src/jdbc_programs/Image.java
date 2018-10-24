package jdbc_programs;

import java.sql.*;
import java.io.*;


public class Image 
{
	
	
	public void connect()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mayur");
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
	
	public void close()
	{
		con.close();
	}
	
	public void insert()
	{
		PreparedStatement p=con.prepareStatement("insert into images values(?,?,?)");
		
		p.setInt(1, 1);
		p.setString(3, "man");
		
		
		FileInputStream f=new FileInputStream("Desert.jpg");
		
		p.setBinaryStream(2, f,f.available());
		
		int i=p.executeUpdate();
		
		System.out.println(i+"\tRecord Added Successfully");
		
		f.close();
		
	}
	
	
	public void select()
	{
		
	}
	
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mayur");
			
			PreparedStatement p=con.prepareStatement("insert into images values(?,?,?)");
			
			p.setInt(1, 1);
			p.setString(3, "man");
			
			
			FileInputStream f=new FileInputStream("Desert.jpg");
			
			p.setBinaryStream(2, f,f.available());
			
			int i=p.executeUpdate();
			
			System.out.println(i+"\tRecord Added Successfully");
				
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	

}


