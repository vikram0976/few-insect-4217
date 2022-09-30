package com.vikram.Usecases;


import java.util.Scanner;

import com.vikram.DAO.CriminalDAO;
import com.vikram.DAO.CriminalaDAOImpl;
import com.vikram.bean.Criminal_Info;

public class DelectCriminalUsecase {

public static void DeleteCriminal() {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Cid: ");
		int id=sc.nextInt();
		
		CriminalDAO dao=new CriminalaDAOImpl();

		Criminal_Info criminal=new Criminal_Info();
	
		criminal.setCid(id);
		
      String result= dao.DeleteCriminal(criminal);
		
		System.out.println(result);
		
		
	}
	
}
