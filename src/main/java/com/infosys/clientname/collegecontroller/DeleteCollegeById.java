package com.infosys.clientname.collegecontroller;

import com.infosys.clientname.unidao.CollegeDAOImpl;

public class DeleteCollegeById {

	public static void main(String[] args) {
		CollegeDAOImpl dao = new CollegeDAOImpl();
		dao.deleteCollegeById(1235);
	}

}
