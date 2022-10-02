package com.vikram.DAO;

import java.util.List;
import com.vikram.Exception.Criminal_InfoExcetion;
import com.vikram.bean.Criminal_Info;

public interface CriminalDAO {

	public String AddCriminal(Criminal_Info criminalInfo);
    
	public List<Criminal_Info> ViewCriminal() throws Criminal_InfoExcetion;
	
	public Criminal_Info getcriminalByCId(int Cid) throws   Criminal_InfoExcetion;
	
	public String UpdateCriminal(Criminal_Info criminalInfo);
	
	public String DeleteCriminal(Criminal_Info criminalInfo);
	
	
	
}
