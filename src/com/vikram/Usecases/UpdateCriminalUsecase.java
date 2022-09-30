package com.vikram.Usecases;

import java.util.Scanner;

import com.vikram.DAO.CriminalDAO;
import com.vikram.DAO.CriminalaDAOImpl;
import com.vikram.bean.Criminal_Info;

public class UpdateCriminalUsecase {

	public static void Updatecriminal() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Criminal Name: ");
		String name=sc.next();
		
		System.out.println("Enter the 2Cid: ");
		int id=sc.nextInt();
		
		CriminalDAO dao=new CriminalaDAOImpl();

		Criminal_Info criminal=new Criminal_Info();
		
		
		criminal.setName(name);
		criminal.setCid(id);
		
      String result= dao.UpdateCriminal(criminal);
		
		System.out.println(result);
		
		
	}
	
}

