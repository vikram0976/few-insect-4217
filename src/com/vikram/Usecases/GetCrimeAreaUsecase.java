package com.vikram.Usecases;
import java.util.List;
import java.util.Scanner;

import com.vikram.DAO.CrimeDAO;
import com.vikram.DAO.CrimeDAOImp;
import com.vikram.Exception.Crime_InfoExcetion;
import com.vikram.bean.Crime_Info;

public class GetCrimeAreaUsecase {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Crime Area : ");
		String n=sc.next();
	CrimeDAO dao = new CrimeDAOImp();
		
		try {
		List<Crime_Info> criminals= dao.CrimeArea(n);
		
		criminals.forEach(s ->{
			
			System.out.println("Crime Id :"+s.getCrimeId());
			System.out.println("Crime Date : "+s.getCdate());
			System.out.println("Crime Place: "+s.getCplace());
			System.out.println("Crime Name: "+s.getCrime());
			System.out.println("Crime Victims: "+s.getVictims());
			System.out.println("Crime Description: "+s.getDescription_Crime());
			System.out.println("Crime Suspected name : "+s.getSuspected_name());
			System.out.println("Crime Case Status: "+s.getCase_Status());
			
			System.out.println("================================================");
			
			System.out.println();
			
			
		});
		
		}catch(Crime_InfoExcetion se) {
			System.out.println(se.getMessage());
		}
		

	}
}
