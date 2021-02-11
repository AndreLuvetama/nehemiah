package com.gestao.nehemiah.servicos;

import java.util.List;
import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestao.nehemiah.cadastro.Pessoa;
import com.gestao.nehemiah.dto.PessoaDTO;
import com.gestao.nehemiah.enuns.Batizado;
import com.gestao.nehemiah.enuns.Empregado;
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
	
	@Transactional()
	public PessoaDTO insert(PessoaDTO dto) {
		Pessoa pessoa = new Pessoa(null, dto.getNome(),  dto.getDataNasc(),dto.getSexo(), dto.getNacionalidade(), 
				dto.getCargo(), dto.getProfissao(), dto.getRedesSocial(), dto.getEstadoCivil(), dto.getComentario(), Empregado.EMPREGADO,
				dto.getIgrejaOrigem(),  dto.getCargoAnterior(), Batizado.NAO_BATIZADO, dto.getCelular());
		
		pessoa = repositorio.save(pessoa);
		return new PessoaDTO(pessoa);
		
	}
	@Transactional
	public PessoaDTO setPessoa(Long id) {
		Pessoa pessoa = repositorio.getOne(id);
		pessoa.setBatizadoNbatizado(Batizado.BATIZADO); // alterando o campo bzatizado
		pessoa.setComentario("Pastor Local");
		pessoa.setCelular("1284949");
		pessoa = repositorio.save(pessoa);
		return new PessoaDTO(pessoa);
	}
	
		
}
