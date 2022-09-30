package com.vikram.Usecases;

import java.util.Scanner;

import com.vikram.DAO.CrimeDAO;
import com.vikram.DAO.CrimeDAOImp;
import com.vikram.bean.Crime_Info;

public class DeleteCrimeUsecase {

	public static void DelectCrimeRecord() {
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Cid: ");
			int id=sc.nextInt();
			
			CrimeDAO dao=new CrimeDAOImp();

			Crime_Info crime=new Crime_Info();
		
			crime.setCrimeId(id);;
			
	        String result= dao.DeleteCrime(crime);
			
			System.out.println(result);

	}
}

