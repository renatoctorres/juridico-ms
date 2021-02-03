package com.empresa.infra.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.core.model.TipoPessoaDTO;
import com.empresa.core.usecases.cliente.TipoPessoaService;

@RestController
@RequestMapping("/tipo-pessoa")
public class TipoPessoaController {
	
	@Autowired
	TipoPessoaService service;
	
	@GetMapping
	public ResponseEntity<List<TipoPessoaDTO>> buscarTodos(){
		List<TipoPessoaDTO> lista = this.service.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/page")
	public ResponseEntity<Page<TipoPessoaDTO>> buscarPaginado(@RequestBody Pageable page){
		Page<TipoPessoaDTO> pageTipoPessoaDTO = this.service.findByPage(page);
		return ResponseEntity.ok(pageTipoPessoaDTO);
	}
	
	@PostMapping
	public ResponseEntity<TipoPessoaDTO> salvar(@RequestBody TipoPessoaDTO tipoPessoa){
		TipoPessoaDTO tipoPessoaDTO = this.service.save(tipoPessoa);
		return ResponseEntity.ok(tipoPessoaDTO);
	}
	
	@PutMapping
	public ResponseEntity<TipoPessoaDTO> atualizar(@RequestBody TipoPessoaDTO tipoPessoa){
		TipoPessoaDTO tipoPessoaDTO = this.service.save(tipoPessoa);
		return ResponseEntity.ok(tipoPessoaDTO);
	}

}
