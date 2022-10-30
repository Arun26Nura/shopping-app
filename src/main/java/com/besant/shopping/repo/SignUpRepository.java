package com.besant.shopping.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.besant.shopping.pojo.Userprofile;

public class SignUpRepository {

	public boolean signup(Userprofile user) {
		boolean isRecordsAdded= false;
		try {
		Connection con= JdbcConnection.getConnection();
		if(con!=null) {
		String query= "insert into user_profile values (?,?,?,?,?,?)";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1,user.getName());
		ps.setString(2,user.getPsw());
		ps.setLong(3, user.getPhone());
		ps.setString(4,user.getEmail());
		ps.setString(5,user.getAddress());
		ps.setString(6,user.getUserId());
		int result =ps.executeUpdate();
		if(result ==1){
			isRecordsAdded=true;	
		}			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}		
		
		return isRecordsAdded;
	}
	
}
