package pro.wings.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import pro.wings.web.model.Students;

public class StudentsDao {

	public Students getStudents(int a_id) {
		Students s = new Students();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marish", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from alien where a_id=" + a_id);
			if (rs.next()) {
				s.setA_id(rs.getInt(1));
				s.setA_name(rs.getString(2));
				s.setTech(rs.getString(3));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
}
