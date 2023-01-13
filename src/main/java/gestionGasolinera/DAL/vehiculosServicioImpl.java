package gestionGasolinera.DAL;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service
public class vehiculosServicioImpl implements vehiculosService {

	@PersistenceContext
	private EntityManager em;
	public void insterarVehiculo(vehiculos vh) {
		// TODO Auto-generated method stub
		em.persist(vh);

	}

	public List<vehiculos> selectVehiculos() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT vehiculos FROM dlk_gga_vehiculo vehiculos").getResultList();
	}

}
