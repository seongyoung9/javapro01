package com.exam09.phone;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePhone implements IServicePhone {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	IDaoPhone dao;

	@Override
	public List<ModelPhone> getPhoneList() {
		List<ModelPhone> result = null;
		
		try {
			result = dao.getPhoneList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int insertPhone(ModelPhone phone) {
		int result = -1;
		
		try {
			result = dao.insertPhone( phone );
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
