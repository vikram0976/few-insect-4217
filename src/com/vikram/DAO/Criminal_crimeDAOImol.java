package com.vikram.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vikram.Exception.Criminal_InfoExcetion;
import com.vikram.Utility.DBUtil;
import com.vikram.bean.Criminal_Info;

public class Criminal_crimeDAOImol implements Criminal_crimeDAO {

	@Override
	public List<Criminal_Info> CrimeFile(String cname) throws Criminal_InfoExcetion {
		List<Criminal_Info> Criminals= new ArrayList<>();


		try(Connection conn= DBUtil.provideConnection();) {
		
			PreparedStatement ps = conn.prepareStatement ("select c.cname, cr.crime_name from criminal c INNER JOIN criminfo cr INNER JOIN "
					+ "criminal_crime ccr ON ccr.crimId=cr.crimId AND "
					+ "ccr.cid=c.cid AND cr.crime_name=?");
			ps.setString(1,cname );
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				
            Criminal_Info cri=new Criminal_Info();
            
			cri.setName(rs.getString("cname"));
			cri.setCrime_Name(rs.getString("Crime_name"));
     
	        Criminals.add(cri);
	
			   }
			
			} catch (SQLException e) {
				throw new Criminal_InfoExcetion(e.getMessage());
				
			  }
			
			
			if(Criminals.size() == 0)
				throw new Criminal_InfoExcetion("No Criminal crime found..");
			
			return Criminals;
	
	}

	@Override
	public String AddCriminalCrime(int id, int id1) {
		String msg = "not inserted";
		try (Connection con = DBUtil.provideConnection()){
			
		PreparedStatement ps =	con.prepareStatement("insert into criminal_crime values(?,?)");
		ps.setInt(1, id);
		ps.setInt(2, id1);
		
		int x = ps.executeUpdate();
		if(x>0) {
			msg = "Criminal crime addedd succesfully";
		}
		else {
			msg = "unable to add";
		}
			
		} catch (SQLException e) {
			msg = e.getMessage();
		}
		return msg;
	}

}
