package com.gestao.nehemiah.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestao.nehemiah.dto.PessoaDTO;
import com.gestao.nehemiah.servicos.PessoaServico;

@RestController
@RequestMapping(value = "/cadastro")
public class PessoaControlador {
	
	@Autowired
	private PessoaServico servicos;
	
	@GetMapping
	public ResponseEntity<List<PessoaDTO>> findAll(){
		List<PessoaDTO> list = servicos.findAll();
		return ResponseEntity.ok().body(list);
	}

}
