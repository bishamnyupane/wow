import java.sql.*;
class Updateanddel{
	public static void main(String [] args) throws ClassNotFoundException,SQLException{
		String url="jdbc:mysql://localhost:3306/bishamlab";
		String uname="root";
		String pwd="";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection(url,uname,pwd);
		Statement stmt=cn.createStatement();
		
		String p="Update students set name= 'bishamneupane' where name='Ram'";
		int i=stmt.executeUpdate(p);
		System.out.print("Number of records update="+i+"\n");
		
		String q="Delete from students where faculty='IT'";
		int j=stmt.executeUpdate(q);
		System.out.print("Number of records deleted="+j+"\n");
		
		
				}
}
