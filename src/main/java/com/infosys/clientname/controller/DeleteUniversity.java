package com.infosys.clientname.controller;

import com.infosys.clientname.unidao.UniversityDAOImpl;

public class DeleteUniversity {

	public static void main(String[] args) {
		
		UniversityDAOImpl dao = new UniversityDAOImpl();
		dao.deleteUniversityById(101);
	}

}
