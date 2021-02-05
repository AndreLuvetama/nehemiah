package com.gestao.nehemiah.servicos;

import java.util.List;
import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestao.nehemiah.cadastro.Pessoa;
import com.gestao.nehemiah.dto.PessoaDTO;
import com.gestao.nehemiah.repositorio.PessoaRepositorio;

@Service
public class PessoaServico {
	
	@Autowired
	private PessoaRepositorio repositorio;
	
	@Transactional(readOnly = true)
	public List<PessoaDTO> findAll(){
		List<Pessoa> list = repositorio.findAllByOrderByNomeAsc();
		return list.stream().map(x -> new PessoaDTO(x)).collect(Collectors.toList());
		
	}
}
