package gestionGasolinera.DAL;

import javax.persistence.*;

@Entity
@Table(name="dlk_gga_combustible", schema="dlk_gga")
public class combustible {

	public combustible(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	@Id
	@Column(name="id",unique=true,nullable=false)
	private int id;
	
	@Column(name="nombre",unique=true,nullable=false)
	private String nombre;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
