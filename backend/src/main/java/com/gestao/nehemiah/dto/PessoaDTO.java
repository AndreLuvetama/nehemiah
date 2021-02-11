package com.gestao.nehemiah.dto;

import java.io.Serializable;

import java.util.Date;


import com.gestao.nehemiah.cadastro.Pessoa;
import com.gestao.nehemiah.enuns.Batizado;
import com.gestao.nehemiah.enuns.Empregado;
import com.gestao.nehemiah.enuns.EstadoCivil;


public class PessoaDTO implements Serializable{	
	private static final long serialVersionUID = 1L;
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
	private Batizado batizadoNbatizado;
	private String celular;

	
	
	public PessoaDTO() {}
	
	public PessoaDTO(Long id, String nome, Date dataNasc, String sexo, String nacionalidade, String cargo,
			String profissao, String redesSocial, EstadoCivil estadoCivil, String comentario, Empregado empregado,
			String igrejaOrigem, String cargoAnterior, Batizado batizadoNbatizado, String celular) {
		
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
	
	
	public PessoaDTO(Pessoa entidade) {
		
		id = entidade.getId();
		nome = entidade.getNome();
		dataNasc = entidade.getDataNasc();
		sexo = entidade.getSexo();
		nacionalidade = entidade.getNacionalidade();
		cargo = entidade.getCargo();
		profissao = entidade.getProfissao();
		redesSocial = entidade.getRedesSocial();
		estadoCivil = entidade.getEstadoCivil();
		comentario = entidade.getComentario();
		empregado = entidade.getEmpregado();
		igrejaOrigem = entidade.getIgrejaOrigem();
		cargoAnterior = entidade.getCargoAnterior();
		batizadoNbatizado = entidade.getBatizadoNbatizado();
		celular = entidade.getCelular();
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}


	

}
