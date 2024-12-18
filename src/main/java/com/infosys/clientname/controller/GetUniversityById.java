package com.infosys.clientname.controller;
import com.infosys.clientname.entity.University;
import com.infosys.clientname.unidao.UniversityDAOImpl;

public class GetUniversityById {

	public static void main(String[] args) {
		UniversityDAOImpl dao = new UniversityDAOImpl();
		University university = dao.getUniversityById(101);
		System.out.println(university);
		System.out.println(university.getColleges());
	}

}
