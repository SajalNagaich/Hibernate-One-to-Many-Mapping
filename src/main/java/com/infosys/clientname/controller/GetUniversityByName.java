package com.infosys.clientname.controller;
import com.infosys.clientname.unidao.UniversityDAOImpl;

public class GetUniversityByName {

	public static void main(String[] args) {

		UniversityDAOImpl dao = new UniversityDAOImpl();
		System.out.println(dao.getUniversityByName("aktu"));
		
	}

}
