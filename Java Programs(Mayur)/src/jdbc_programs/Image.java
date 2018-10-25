package jdbc_programs;

import java.sql.*;
import java.io.*;


public class Image 
{
	Connection con=null;
	
	public Connection connect()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mayur");
			
		    System.out.println("Conncetion Has been Successfully !");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
			
	}
	
	public void close(Connection con) 
	{
		try
		{
			con.close();
			System.out.println("Connection is Closed !");
		
		
		}
		catch(Exception e)
		{
			e.getMessage();		
		}
	}
	
	
	public void insert(Connection con)
	{
		try
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
		catch(Exception e)
		{
			e.getMessage();
		}
		
	}
	
	
	public void select(Connection con)
	{
		try
		{
			PreparedStatement p=con.prepareStatement("select * from images");
			ResultSet rs=p.executeQuery();
			
			if(rs.next())
			{
				Blob b=rs.getBlob(2);
				
				byte barr[]=b.getBytes(1, (int)b.length());
				
				FileOutputStream fw= new FileOutputStream("m.jpg");
				fw.write(barr);
				
				fw.close();
				
			}
		
		}
		
		catch(Exception e)
		{
			e.getMessage();
		}
		
		System.out.println("Image is here");
	}
	
	public static void main(String args[])
	{
		Connection con=null;
		
		Image img=new Image();
		
		con=img.connect();
		
		img.insert(con);
		
		img.select(con);
		
		img.close(con);
					
		
	}
	

}


