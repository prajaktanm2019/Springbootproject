package com.restapistudent.Studentapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restapistudent.Studentapi.dao.TestDao;

@Component


public class TestServices {
	@Autowired
	TestDao testdao;
	public List<String> GetData(){
		
		return testdao.Getdata();
	}

}
