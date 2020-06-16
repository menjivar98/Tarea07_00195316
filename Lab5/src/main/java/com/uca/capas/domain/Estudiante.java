package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_estudiante")
	private Integer codigoEstudiante;
	
	@Size(message="E campo no debe contener mas de 30 caractares", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name="nombre")
	private String nombre;
	
	@Size(message="E campo no debe contener mas de 30 caractares", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name="apellido")
	private String apellido;
	

	@NotNull
	@Min(value=18, message="No puede ser menor a 18")
	@Column(name="edad")
	private Integer edad;
	
	@Column(name="estado")
	private Boolean estado;
	
	public Estudiante() {}
	
	
	
	
	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}




	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public Integer getEdad() {
		return edad;
	}




	public void setEdad(Integer edad) {
		this.edad = edad;
	}




	public Boolean getEstado() {
		return estado;
	}




	public void setEstado(Boolean estado) {
		this.estado = estado;
	}




	//Delegate
	public String getEstadoDelegate() {
		if(this.estado==null) return "";
		else {
			return estado ==true ? "Activo":"Inactivo";
		}
	}
	

}
