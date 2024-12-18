package com.infosys.clientname.unidao;
import java.sql.SQLException;
import java.util.List;

import com.infosys.clientname.entity.University;
public interface UniversityDao {
	/**
	 * this method save university in university table in your database
	 * @return void
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	void saveUniversity(University university);
	/**
	 * this method update university in university table in your database
	 * @return true if university update else false
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	boolean updateUniversity(University university);
	/**
	 * this method delete university in university table in your database
	 * @return true if university is delete else false
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	boolean deleteUniversityById(int university);
	/**
	 * this method fetch university from university table from your database
	 * @return University
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	University getUniversityById(int universityId);
	
	/**
	 * this method fetch all universities from university table from your database
	 * @return List 
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	List<University> getAllUniversities();
	/**
	 * this method fetch university by university name from university table from your database
	 * @return University
	 * @param 
	 * @throws SQLException will throw in case database connection error
	 * */
	University getUniversityByName(String univsersityName);
	
}
