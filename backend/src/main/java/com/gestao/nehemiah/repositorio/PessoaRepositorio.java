package com.gestao.nehemiah.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestao.nehemiah.cadastro.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Pessoa, Long>{
	List<Pessoa> findAllByOrderByNomeAsc();

}
