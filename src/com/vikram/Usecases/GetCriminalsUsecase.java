package com.vikram.Usecases;

import java.util.List;

import com.vikram.DAO.CriminalDAO;
import com.vikram.DAO.CriminalaDAOImpl;
import com.vikram.Exception.Criminal_InfoExcetion;
import com.vikram.bean.Criminal_Info;

public class GetCriminalsUsecase {

public static void Criminal() {
		
		CriminalDAO dao = new CriminalaDAOImpl();
		
		try {
		List<Criminal_Info> criminals= dao.ViewCriminal();
		
		criminals.forEach(s ->{
			
			System.out.println("Criminal Id :"+s.getCid());
			System.out.println("Criminal name: "+s.getName());
			System.out.println("Criminal Age: "+s.getAge());
			System.out.println("Criminal Gender: "+s.getGender());
			System.out.println("Criminal Address: "+s.getAddress());
			System.out.println("Criminal Face Mark: "+s.getIdentify_face_mark());
			System.out.println("Criminal Crime Area: "+s.getCrime_Area());
			System.out.println("Criminal Crime Name: "+s.getCrime_Name());
			
			System.out.println("================================================");
			
			System.out.println();
			
			
		});
		
		
		}catch(Criminal_InfoExcetion se) {
			System.out.println(se.getMessage());
		}
		
		
	}
}
