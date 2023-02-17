package servelet_jsp_McDonalds_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servelet_jsp_McDonalds_dto.Menu;

public class MenuDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}

	public Menu saveMenu(Menu menu) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return menu;
	}

	public List<Menu> getAllMenu() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select m from Menu m");
		List<Menu> menu1 = query.getResultList();
		return menu1;

	}
	public Menu getMenuById(int id)
	{
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select m from Menu m where m.id=?1");
		
		Menu menu=(Menu) query.getSingleResult();
		return menu;
	}
}
