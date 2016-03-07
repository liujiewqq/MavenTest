package com.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlJdbcDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		// 注册驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/mysql?"
					+ "user=root&password=123456&useUnicode=true&characterEncoding=UTF8";
			// 获取连接
			con = DriverManager.getConnection(url);

			// 获取StateMent
			Statement stmt = con.createStatement();

			// 执行sql
			String sql = null;

			sql = "select * from person";

			ResultSet resultSet = stmt.executeQuery(sql);

			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}

		} catch (Exception e) {
		} finally {
			con.close();
		}

	}

}
