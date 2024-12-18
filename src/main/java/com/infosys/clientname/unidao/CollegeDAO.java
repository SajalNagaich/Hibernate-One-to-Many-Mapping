package com.infosys.clientname.unidao;

import java.sql.SQLException;
import java.util.List;

import com.infosys.clientname.entity.College;

public interface CollegeDAO {
	/**
	 * this method save College in College table in your database
	 * @return void
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	
	void saveCollege(College college);
	/**
	 * this method update College in College table in your database
	 * @return true if College update else false
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	boolean updateCollege(College college);
	/**
	 * this method delete College in College table in your database
	 * @return true if university is delete else false
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	boolean deleteCollegeById(int collegeId);
	/**
	 * this method fetch College from College table from your database
	 * @return College
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	College getCollegeById(int collegeId);
	
	/**
	 * this method fetch all Colleges from Colleges table from your database
	 * @return List 
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	List<College> getAllColleges();
	/**
	 * this method fetch College by College name from university table from your database
	 * @return University
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	College getCollegeByName(String CollegeName);

}
