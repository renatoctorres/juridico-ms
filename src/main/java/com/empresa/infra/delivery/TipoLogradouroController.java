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

import com.empresa.core.model.TipoLogradouroDTO;
import com.empresa.core.usecases.TipoLogradouroService;

@RestController
@RequestMapping("/tipo-logradouro")
public class TipoLogradouroController {
	
	@Autowired
	TipoLogradouroService service;
	
	@GetMapping
	public ResponseEntity<List<TipoLogradouroDTO>> buscarTodos(){
		List<TipoLogradouroDTO> lista = this.service.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/page")
	public ResponseEntity<Page<TipoLogradouroDTO>> buscarPaginado(@RequestBody Pageable page){
		Page<TipoLogradouroDTO> pageTipoLogradouroDTO = this.service.findByPage(page);
		return ResponseEntity.ok(pageTipoLogradouroDTO);
	}
	
	@PostMapping
	public ResponseEntity<TipoLogradouroDTO> salvar(@RequestBody TipoLogradouroDTO tipoLogradouro){
		TipoLogradouroDTO tipoLogradouroDTO = this.service.save(tipoLogradouro);
		return ResponseEntity.ok(tipoLogradouroDTO);
	}
	
	@PutMapping
	public ResponseEntity<TipoLogradouroDTO> atualizar(@RequestBody TipoLogradouroDTO tipoLogradouro){
		TipoLogradouroDTO tipoLogradouroDTO = this.service.save(tipoLogradouro);
		return ResponseEntity.ok(tipoLogradouroDTO);
	}

}
