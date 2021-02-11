package com.gestao.nehemiah.cadastro;
import  com.gestao.nehemiah.enuns.*;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Date dataNasc;
	private String sexo;
	private String nacionalidade;
	private String cargo;
	private String profissao;
	private String redesSocial;
	private EstadoCivil estadoCivil;
	private String comentario;
	private Empregado empregado;
	private String igrejaOrigem;
	private String cargoAnterior;
	//private Long batizadoNbatizado;
	private Batizado batizadoNbatizado;
	private String celular;
	

	




	public Pessoa() {}


	public Pessoa(Long id, String nome, Date dataNasc, String sexo, String nacionalidade, String cargo,
			String profissao, String redesSocial, EstadoCivil estadoCivil, String comentario, Empregado empregado,
			String igrejaOrigem, String cargoAnterior, Batizado batizadoNbatizado, String celular) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
		this.cargo = cargo;
		this.profissao = profissao;
		this.redesSocial = redesSocial;
		this.estadoCivil = estadoCivil;
		this.comentario = comentario;
		this.empregado = empregado;
		this.igrejaOrigem = igrejaOrigem;
		this.cargoAnterior = cargoAnterior;
		this.batizadoNbatizado = batizadoNbatizado;
		this.celular = celular;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	public String getRedesSocial() {
		return redesSocial;
	}


	public void setRedesSocial(String redesSocial) {
		this.redesSocial = redesSocial;
	}


	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public Empregado getEmpregado() {
		return empregado;
	}


	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}


	public String getIgrejaOrigem() {
		return igrejaOrigem;
	}


	public void setIgrejaOrigem(String igrejaOrigem) {
		this.igrejaOrigem = igrejaOrigem;
	}


	public String getCargoAnterior() {
		return cargoAnterior;
	}


	public void setCargoAnterior(String cargoAnterior) {
		this.cargoAnterior = cargoAnterior;
	}


	public Batizado getBatizadoNbatizado() {
		return batizadoNbatizado;
	}


	public void setBatizadoNbatizado(Batizado batizadoNbatizado) {
		this.batizadoNbatizado = batizadoNbatizado;
	}
	
	





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
		

}
