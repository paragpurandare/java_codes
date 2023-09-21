package src;
import java.sql.*;
import java.util.*;

class JDBC {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/parag";
		String user="root";
		String pwd="p@r@g2003";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollNo: ");
		int rno = sc.nextInt();
		
		System.out.println("Enter Sname: ");
		String sname = sc.next();
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 Statement st=con.createStatement();
			 
			 String sqlInsert="insert into STUDENT values('"+rno+"','"+sname+"')";
			 st.executeUpdate(sqlInsert);
			 System.out.println("record inserted successfully");
			 
			 
			 String sql="select * from stud";
			 ResultSet rs= st.executeQuery(sql);
			 while(rs.next()) {
				 System.out.println("RollNo: "+rs.getInt(1));
				 System.out.println("Sname: "+rs.getString(2));
				 
			 }
			 
			 
			 con.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
	}

};
