package com.infosys.clientname.unidao;

import java.util.List;

import com.infosys.clientname.entity.University;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UniversityDAOImpl implements UniversityDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
	EntityManager em  = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	@Override
	public void saveUniversity(University university) {
		try {
			et.begin();
			em.persist(university);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean updateUniversity(University university) {
		try {
			et.begin();
			em.merge(university);
			et.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteUniversityById(int universityId) {
		University university = em.find(University.class, universityId);
		
		try {
			et.begin();
			em.remove(university);
			et.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public University getUniversityById(int universityId) {
		
		return em.find(University.class, universityId);
	}

	@Override
	public List<University> getAllUniversities() {
		
		return em.createQuery("FROM University").getResultList();
	}

	@Override
	public University getUniversityByName(String universityName) {
		String jpql = "Select e From University e Where e.name = ?1";
		Query query = em.createQuery(jpql);
		query.setParameter(1, universityName);
		University university = (University)query.getSingleResult();
		return university;
	}

}
