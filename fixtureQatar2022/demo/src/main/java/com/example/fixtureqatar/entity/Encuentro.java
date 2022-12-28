package com.example.fixtureqatar.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="encuentros")
public class Encuentro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private LocalDate fechayhoraencuentro;
	private String nombrelocal;
	private String nombrevisitante;
	private String grupo;
	private String estadio;
	private Integer tanteadorL90;
	private Integer tanteadorv90;
	private Integer tanteadorl120;
	private Integer tanteadorv120;
	private Integer tanteadorlp;
	private Integer tanteadorvp;
	private String ganador;
	private String fase;
	//constructor
	public Encuentro() {
		super();
	}
	//constructor
	public Encuentro(Integer id, LocalDate fechayhoraencuentro, String nombrelocal, String nombrevisitante,
			String grupo, String estadio, Integer tanteadorL90, Integer tanteadorv90, Integer tanteadorl120,
			Integer tanteadorv120, Integer tanteadorlp, Integer tanteadorvp, String ganador, String fase) {
		super();
		this.id = id;
		this.fechayhoraencuentro = fechayhoraencuentro;
		this.nombrelocal = nombrelocal;
		this.nombrevisitante = nombrevisitante;
		this.grupo = grupo;
		this.estadio = estadio;
		this.tanteadorL90 = tanteadorL90;
		this.tanteadorv90 = tanteadorv90;
		this.tanteadorl120 = tanteadorl120;
		this.tanteadorv120 = tanteadorv120;
		this.tanteadorlp = tanteadorlp;
		this.tanteadorvp = tanteadorvp;
		this.ganador = ganador;
		this.fase = fase;
	}
	//getters y setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getFechayhoraencuentro() {
		return fechayhoraencuentro;
	}
	public void setFechayhoraencuentro(LocalDate fechayhoraencuentro) {
		this.fechayhoraencuentro = fechayhoraencuentro;
	}
	public String getNombrelocal() {
		return nombrelocal;
	}
	public void setNombrelocal(String nombrelocal) {
		this.nombrelocal = nombrelocal;
	}
	public String getNombrevisitante() {
		return nombrevisitante;
	}
	public void setNombrevisitante(String nombrevisitante) {
		this.nombrevisitante = nombrevisitante;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getEstadio() {
		return estadio;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	public Integer getTanteadorL90() {
		return tanteadorL90;
	}
	public void setTanteadorL90(Integer tanteadorL90) {
		this.tanteadorL90 = tanteadorL90;
	}
	public Integer getTanteadorv90() {
		return tanteadorv90;
	}
	public void setTanteadorv90(Integer tanteadorv90) {
		this.tanteadorv90 = tanteadorv90;
	}
	public Integer getTanteadorl120() {
		return tanteadorl120;
	}
	public void setTanteadorl120(Integer tanteadorl120) {
		this.tanteadorl120 = tanteadorl120;
	}
	public Integer getTanteadorv120() {
		return tanteadorv120;
	}
	public void setTanteadorv120(Integer tanteadorv120) {
		this.tanteadorv120 = tanteadorv120;
	}
	public Integer getTanteadorlp() {
		return tanteadorlp;
	}
	public void setTanteadorlp(Integer tanteadorlp) {
		this.tanteadorlp = tanteadorlp;
	}
	public Integer getTanteadorvp() {
		return tanteadorvp;
	}
	public void setTanteadorvp(Integer tanteadorvp) {
		this.tanteadorvp = tanteadorvp;
	}
	public String getGanador() {
		return ganador;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
	
	
	
 	

}
