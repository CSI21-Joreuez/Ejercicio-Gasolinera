package gestionGasolinera.DAL;

import java.util.List;

public interface depositoService {

	public void llenarDeposito(deposito dp);

	public List<combustible> selectDepositos();
	
	public void borrarUltimoLLenado(deposito dp);

}
