package com.infosys.clientname.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.infosys.clientname.entity.College;
import com.infosys.clientname.entity.University;
import com.infosys.clientname.unidao.UniversityDAOImpl;

public class UpdateUniversity {

	public static void main(String[] args) {

		UniversityDAOImpl dao = new UniversityDAOImpl();
	
		College college1 = new College(1236, "Rde", "ghaziabad", "eng");
		College college2 = new College(1237, "hrit", "ghaziabad", "eng");
		List<College> colleges = new ArrayList(Arrays.asList(college1,college2));
		
		University university = new University(101, "CCS University", "meerut", colleges);
		dao.updateUniversity(university);
		
	}

}
