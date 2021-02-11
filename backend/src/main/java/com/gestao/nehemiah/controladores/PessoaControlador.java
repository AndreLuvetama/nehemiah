package com.gestao.nehemiah.controladores;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<PessoaDTO> insert(@RequestBody PessoaDTO dto){
		dto = servicos.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
				buildAndExpand(dto.getId()).toUri();
				return ResponseEntity.created(uri).body(dto);
		
	}
	
	@PutMapping("/{id}/cadastrado")
	public ResponseEntity<PessoaDTO> setPessoa(@PathVariable Long id){
		PessoaDTO dto = servicos.setPessoa(id);		
		return ResponseEntity.ok().body(dto);
	}
	
	
	
	

}
