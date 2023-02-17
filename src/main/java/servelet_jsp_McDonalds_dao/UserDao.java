package servelet_jsp_McDonalds_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servelet_jsp_McDonalds_dto.User;

public class UserDao {
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	public User saveUser(User user)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
		
	}
	public User loginUser(String email)
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select u from User u where u.email=?1 ");
		query.setParameter(1, email);
		User user=(User) query.getSingleResult();
		return user;
		
	}
	

}
