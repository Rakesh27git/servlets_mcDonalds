package servelet_jsp_McDonalds_dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servelet_jsp_McDonalds_dto.Items;
import servelet_jsp_McDonalds_dto.Menu;

public class ItemsDao {
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	public Items saveItems(Items items)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(items);
		entityTransaction.commit();
		return items;
		
	}
	public List<Items> getAllItems()
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("Select i from Items i");
		List<Items> list= query.getResultList();
		return list;
		
	}

}
