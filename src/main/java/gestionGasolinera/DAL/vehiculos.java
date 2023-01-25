package gestionGasolinera.DAL;

import java.sql.Date;
import java.util.Calendar;
import javax.persistence.*;

@Entity
@Table(name="dlk_gga_vehiculos",schema="dlk_gga")
public class vehiculos {

	
	
	public vehiculos() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="id",unique=true,nullable=false)
	private int id;
	
	@Column(name="fecha",unique=false,nullable=false)
	private Calendar fecha;
	
	@Column(name="dni",unique=true,nullable=true)
	private String dni;
	
	@Column(name="matricula",unique=true,nullable=true)
	private String matricula;
	
	@Column(name="importe",unique=false,nullable=false)
	private int importe;
	
	@Column(name="id_combustible",unique=false)
	private int id_combustible;
	
	public int getId_combustible() {
		return id_combustible;
	}

	public void setId_combustible(int id_combustible) {
		this.id_combustible = id_combustible;
	}


	
	public vehiculos(int id, Calendar fecha, String dni, String matricula, int importe,int id_combustible) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.dni = dni;
		this.matricula = matricula;
		this.importe = importe;
		this.id_combustible=id_combustible;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}
	

	
	
}
