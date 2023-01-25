package impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import gestionGasolinera.DAL.combustible;
import gestionGasolinera.DAL.combustibleServicioImpl;
import gestionGasolinera.DAL.deposito;
import gestionGasolinera.DAL.depositoServicioImpl;
import gestionGasolinera.DAL.vehiculos;
import gestionGasolinera.DAL.vehiculosServicioImpl;

@Service
public class Consultas {

	@Autowired
	private combustibleServicioImpl psi;
	
	@Autowired
	private vehiculosServicioImpl psi2;
	
	@Autowired
	private depositoServicioImpl ps3;
	
	
	@Transactional
	public List<combustible> selectCombustibles()
	{
		return psi.selectCombustibles();
	}
	@Transactional
	public void insterarVehiculo( vehiculos vh)
	{
		psi2.insterarVehiculo(vh);
	}
	
	@Transactional
	public List<vehiculos> selectVehiculos ()
	{
		return psi2.selectVehiculos();
	}
	@Transactional
	public void borrarUltimoLLenado(deposito dp)
	{
		ps3.borrarUltimoLLenado(dp);
	}
	
	@Transactional
	public void llenarDeposito(deposito dp)
	{
		ps3.llenarDeposito(dp);
	}
	@Transactional
	public List<deposito> selectDepositos()
	{
		return ps3.selectDepositos();
	}
	
}
