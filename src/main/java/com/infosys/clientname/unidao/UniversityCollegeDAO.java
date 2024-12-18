package com.infosys.clientname.unidao;

import java.sql.SQLException;
import java.util.List;

import com.infosys.clientname.entity.College;
import com.infosys.clientname.entity.University;

public interface UniversityCollegeDAO {
	/**
	 * this method save College in College table With University Data in University table of your database
	 * @return void
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	public void saveUniversityWithCollege(University university,List<College> colleges);
	/**
	 * this method update College in College table With University Data in University table of your database
	 * @return void
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	public void updateUniversityWithCollege(University university,List<College> colleges);
	
	/**
	 * this method will fetch colleges data of university from your database
	 * @return List
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	public List<College> getCollegesOfUniversity(int universityId);
	/**
	 * this method add college With University Data in University table of your database
	 * @return void
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	public void addCollegeToUniversity(int universityId, College college);
	/**
	 * this method will remove college from University table from your database
	 * @return true if data is removed else false
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	
	public boolean removeCollegeFromUniversity(int universityId, int collegeId);
	
	/**
	 * this method will fetch university of college 
	 * @return University
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	public University getUniverSityOfCollege(int collegeId);
}
