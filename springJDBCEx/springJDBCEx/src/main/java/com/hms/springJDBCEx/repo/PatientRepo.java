package com.hms.springJDBCEx.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hms.springJDBCEx.model.Patient;

@Repository
public class PatientRepo {
	
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void save(Patient patient) {
		System.out.println("Patient Added");
		String sql= "insert into Patient(id,name,amount) values (?,?,?)";
		int rows = jdbcTemplate.update(sql,patient.getId(),patient.getName(),patient.getAmount());
		System.out.println(rows + " effected");
	}
	public List<Patient> findAll() {
		List<Patient> patients= new ArrayList<>();
		String sql="select * from patient";
		RowMapper<Patient> rm= new RowMapper<Patient>() {
			
			@Override
			public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Patient p =new Patient();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setAmount(rs.getInt("amount"));
				return p;
			}
		};
		
		return jdbcTemplate.query(sql, rm);
	};
}
