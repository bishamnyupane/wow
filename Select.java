import java.sql.*;
class Select{
	public static void main(String [] args) throws ClassNotFoundException,SQLException{
		String url="jdbc:mysql://localhost:3306/bisham";
		String uname="root";
		String pwd="";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection(url,uname,pwd);
		Statement stmt=cn.createStatement();
		String q="select * from student";
		ResultSet rs=stmt.executeQuery(q);
		while(rs.next()) {
			System.out.print("Name="+rs.getString(2)+"\t");
		}


		String q1="SELECT count(roll) FROM student";
		ResultSet r=stmt.executeQuery(q1);
		r.next();
		System.out.println("Total students: "+r.getInt(1));

		String q2="SELECT AVG(marks) FROM student";
		ResultSet s=stmt.executeQuery(q2);
		r.next();
		System.out.println("AVg Marks: "+s.getFloat(1));
		
		cn.close();
				}
}
