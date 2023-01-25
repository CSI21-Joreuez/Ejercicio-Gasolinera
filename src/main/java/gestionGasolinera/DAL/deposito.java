package gestionGasolinera.DAL;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="dlk_gga_deposito",schema="dlk_gga")
public class deposito {
	public deposito() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public int getTipo_combustible() {
		return tipo_combustible;
	}

	public void setTipo_combustible(int tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}

	public deposito(int id, Calendar fecha, int litros, int tipo_combustible) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.litros = litros;
		this.tipo_combustible = tipo_combustible;
	}

	@Id
	@Column(name="id", unique= true, nullable=false)
	private int id;
	
	@Column(name="fecha")
	private Calendar fecha;
	
	@Column(name="litros")
	private int litros;
	
	@Column(name="tipo_combustible")
	private int tipo_combustible;
	
	

}
