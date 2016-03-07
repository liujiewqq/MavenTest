package com.study2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service("springTest")
public class SpringTest {
	@Resource
	private JdbcTemplate jdbcTemplate;

	public void say() {
		List<String> list=jdbcTemplate.query("select * from person", new RowMapper<String>() {

					public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(1);
			}
		});
		System.out.println("==================="+list);
	}
}
