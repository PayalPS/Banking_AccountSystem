
package com.cognizant.dao;
import com.cognizant.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

class UserRowMapper implements RowMapper<User>{
	public User mapRow(ResultSet rs, int rowNum)throws SQLException{
		User u = new User();
		u.setFirstName(rs.getString(1));
		u.setLastName(rs.getString(2));
		u.setContact(rs.getString(3));
		u.setDOB(rs.getInt(4));
		u.setEmail(rs.getString(5));
		u.setPassword(rs.getString(6));
		u.setAccountType(rs.getString(7));
		return u;
	}
}

public class UserDaoImpl implements UserDao{
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean userRegister(User user) {
		int check =0;
		try {
			check=jdbcTemplate.update("insert into userTable values ("+ 
					user.getFirstName() + "," + 
					user.getLastName() + "," + 
					user.getContact() + "," +
					user.getDOB() + "," +
					user.getEmail() + "," +
					user.getPassword() + "," +
					user.getAccountType() +")"
					);
			if(check==1) {
				System.out.println("Your details are submitted successfully");
				return true;
			}
			else 
				return false;
		}
		catch(DataAccessException e) {
			System.out.println();
		}
		return false;
	}

}
