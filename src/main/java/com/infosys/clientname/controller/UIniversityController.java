package com.infosys.clientname.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.infosys.clientname.entity.College;
import com.infosys.clientname.entity.University;
import com.infosys.clientname.unidao.UniversityDAOImpl;
import com.infosys.clientname.unidao.UniversityDao;

public class UIniversityController {

	public static void main(String[] args) {

		UniversityDAOImpl dao = new UniversityDAOImpl();
		College college1 = new College(1236, "Rde", "gzb", "eng");
		College college2 = new College(1237, "hrit", "gzb", "eng");
		List<College> colleges = new ArrayList(Arrays.asList(college1,college2));
		
		University university = new University(101, "aktu", "lucknow", colleges);
		dao.saveUniversity(university);
		
	}

}
