package com.vikram.Usecases;

import java.util.Scanner;

import com.vikram.DAO.CrimeDAO;
import com.vikram.DAO.CrimeDAOImp;
import com.vikram.Exception.Crime_InfoExcetion;

public class GetCrimeStatusCountUsecase {

	public static void countSovingCases() {
		CrimeDAO dao = new CrimeDAOImp();
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of Case status");
		String s1=sc.next();
		
		try {
		int c=dao.statuscount(s1);
		System.out.println("Total Number of solved/Unsolved Cases : "+c);	
			
		} 
		catch (Crime_InfoExcetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}

