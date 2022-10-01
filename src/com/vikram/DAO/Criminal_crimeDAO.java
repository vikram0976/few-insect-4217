package com.vikram.DAO;

import java.util.List;

import com.vikram.Exception.Criminal_InfoExcetion;
import com.vikram.bean.Criminal_Info;

public interface Criminal_crimeDAO {

	public List<Criminal_Info>  CrimeFile(String cname)  throws Criminal_InfoExcetion;
	
	public String AddCriminalCrime(int id, int id1);
}
