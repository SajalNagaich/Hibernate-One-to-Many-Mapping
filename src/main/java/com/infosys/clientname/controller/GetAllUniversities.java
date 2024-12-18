package com.infosys.clientname.controller;
import java.util.List;

import com.infosys.clientname.entity.University;
import com.infosys.clientname.unidao.UniversityDAOImpl;

public class GetAllUniversities {

	public static void main(String[] args) {
		UniversityDAOImpl dao = new UniversityDAOImpl();
		List<University> universities =  dao.getAllUniversities();
		
		for (University university : universities) {
			System.out.println(university);
		}
	}

}
