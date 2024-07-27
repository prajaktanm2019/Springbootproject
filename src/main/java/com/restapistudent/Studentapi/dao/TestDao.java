package com.restapistudent.Studentapi.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TestDao {
	public List<String> Getdata(){
		
	ArrayList<String> Arr=new ArrayList<String>();
	Arr.add("Kishan");
	Arr.add("siya");
	Arr.add("Riya");
	Arr.add("Piya");
	return Arr;
	}
}
