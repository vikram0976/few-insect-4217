package com.vikram.Usecases;

import java.util.List;
import java.util.Scanner;
import com.vikram.DAO.Criminal_crimeDAO;
import com.vikram.DAO.Criminal_crimeDAOImol;
import com.vikram.Exception.Criminal_InfoExcetion;
import com.vikram.bean.Criminal_Info;


public class GetCriminal_crimeUsecase {

	public static void CriminalCrimeRecord() {
		
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter Type Crime Name : ");
	
	String cr=sc.next();
	
	Criminal_crimeDAO dao = new Criminal_crimeDAOImol();
	
	try {
	List<Criminal_Info> criminals= dao.CrimeFile(cr);
	
	criminals.forEach(s ->{
		
		
		System.out.println("Criminal name: "+s.getName());
		System.out.println("Criminal Crime Name: "+s.getCrime_Name());
		
		System.out.println("================================================");
		
		System.out.println();
		
		
	});
	
	
	
	}catch(Criminal_InfoExcetion se) {
		System.out.println(se.getMessage());
	}
	
	
	
}
	
}

