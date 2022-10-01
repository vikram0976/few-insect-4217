package com.vikram.Usecases;

import java.util.Scanner;

import com.vikram.DAO.CrimeDAO;
import com.vikram.DAO.CrimeDAOImp;
import com.vikram.DAO.Criminal_crimeDAO;
import com.vikram.DAO.Criminal_crimeDAOImol;
import com.vikram.bean.Crime_Info;

public class Getcriminal_crimeInsertUsecase {

	public static void AddCriminalCrime() {
		
		Scanner sc= new Scanner (System.in);
		
		
		System.out.println("Enter Crime Id: ");
		int id=sc.nextInt();
		
		System.out.println("Enter Criminal Id : ");
		int id1=sc.nextInt();
		
		Criminal_crimeDAO dao1=new Criminal_crimeDAOImol();
	
		
		String res = dao1.AddCriminalCrime(id, id1);
		
		System.out.println(res);
	
		
}


	
}
