package gestionGasolinera.DAL;

import java.util.List;

public interface depositoService {

	public void llenarDeposito(deposito dp);

	public List<deposito> selectDepositos();
	
	public void borrarUltimoLLenado(deposito dp);

}
