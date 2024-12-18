package com.infosys.clientname.unidao;

import java.util.List;

import com.infosys.clientname.entity.College;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CollegeDAOImpl implements CollegeDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	@Override
	public void saveCollege(College college) {
		try {
			et.begin();
			em.persist(college);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean updateCollege(College college) {
		try {
			et.begin();
			em.merge(college);
			et.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCollegeById(int collegeId) {
		College college = em.find(College.class, collegeId);
		
		try {
			et.begin();
			em.createNativeQuery("delete from university_college where colleges_id = ?1")
			.setParameter(1, collegeId)
			.executeUpdate();
			em.remove(college);
			et.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public College getCollegeById(int collegeId) {
		
		return em.find(College.class, collegeId);
	}

	@Override
	public List<College> getAllColleges() {
		
		return em.createQuery("From University").getResultList();
	}

	@Override
	public College getCollegeByName(String collegeName) {
		String jpql = "select e from University e where e.name = ?1";
		Query query = em.createQuery(jpql);
		query.setParameter(1, collegeName);
		return (College)query.getSingleResult();
		
	}

}
