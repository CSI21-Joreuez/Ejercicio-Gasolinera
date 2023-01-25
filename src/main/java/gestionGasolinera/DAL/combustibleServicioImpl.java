package gestionGasolinera.DAL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class combustibleServicioImpl implements combustibleService {

	@PersistenceContext
	private EntityManager em;
	public List<combustible> selectCombustibles() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT combustible FROM combustible combustible").getResultList();
	}
	

}
