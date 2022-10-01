package com.vikram.Usecases;

import java.util.Scanner;

import com.vikram.DAO.CrimeDAO;
import com.vikram.DAO.CrimeDAOImp;
import com.vikram.Exception.Crime_InfoExcetion;

public class GetcurrentMonthcrimeUsecase {

	
		public static void OneMonthCrime() {
			CrimeDAO dao = new CrimeDAOImp();
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter the  start Date of the Month :");
			String s1=sc.next();
			System.out.println("Enter the end Date of the Month End: ");
			String s2=sc.next();
			
			try {
			int c=dao.Monthcount(s1,s2);
			System.out.println("Number of crimes recorded in the current month : "+c);	
				
			} catch (Crime_InfoExcetion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


