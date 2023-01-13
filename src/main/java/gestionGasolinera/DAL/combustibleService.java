package gestionGasolinera.DAL;

import java.util.List;

public interface combustibleService {

	public void insterarCombustible(combustible cmb);
	
	public List<combustible> selectCombustibles();
	
}
