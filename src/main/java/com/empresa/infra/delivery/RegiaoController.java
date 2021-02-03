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

import com.empresa.core.model.CidadeDTO;
import com.empresa.core.usecases.CidadeService;

@RestController
@RequestMapping("/regiao")
public class RegiaoController {
	
	@Autowired
	CidadeService service;
	
	@GetMapping
	public ResponseEntity<List<CidadeDTO>> buscarTodos(){
		List<CidadeDTO> lista = this.service.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/page")
	public ResponseEntity<Page<CidadeDTO>> buscarPaginado(@RequestBody Pageable page){
		Page<CidadeDTO> pageCidadeDTO = this.service.findByPage(page);
		return ResponseEntity.ok(pageCidadeDTO);
	}
	
	@PostMapping
	public ResponseEntity<CidadeDTO> salvar(@RequestBody CidadeDTO cidade){
		CidadeDTO cidadeDTO = this.service.save(cidade);
		return ResponseEntity.ok(cidadeDTO);
	}
	
	@PutMapping
	public ResponseEntity<CidadeDTO> atualizar(@RequestBody CidadeDTO cidade){
		CidadeDTO cidadeDTO = this.service.save(cidade);
		return ResponseEntity.ok(cidadeDTO);
	}

}
