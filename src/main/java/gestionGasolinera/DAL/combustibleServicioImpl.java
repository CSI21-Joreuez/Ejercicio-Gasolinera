package gestionGasolinera.DAL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public class combustibleServicioImpl implements combustibleService {

	@PersistenceContext
	private EntityManager em;
	
	public void insterarCombustible(combustible cmb) {
		em.persist(cmb);

	}

	public List<combustible> selectCombustibles() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT combustibles FROM dlk_gga_combustible combustibles").getResultList();
	}

}
