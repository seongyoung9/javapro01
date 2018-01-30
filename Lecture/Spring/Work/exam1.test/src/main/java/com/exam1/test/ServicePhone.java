package com.exam1.test;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePhone implements IServicePhone {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	DaoPhone Dao; 

	@Override
	public List<ModelPhone> getPhoneList() {
		List<ModelPhone> result = null;
		
		try {
			result = Dao.getPhoneList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int insertPhone(ModelPhone phone) {
		int result = -1;
		
		try {
			result = Dao.insertPhone( phone );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
