package com.exam1.test;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface IDaoPhone {
	
	List<ModelPhone> getPhoneList();
	int insertPhone( ModelPhone phone );

}
