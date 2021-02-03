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

import com.empresa.core.model.TipoEnderecoDTO;
import com.empresa.core.usecases.TipoEnderecoService;

@RestController
@RequestMapping("/tipo-endereco")
public class TipoEnderecoController {
	
	@Autowired
	TipoEnderecoService service;
	
	@GetMapping
	public ResponseEntity<List<TipoEnderecoDTO>> buscarTodos(){
		List<TipoEnderecoDTO> lista = this.service.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/page")
	public ResponseEntity<Page<TipoEnderecoDTO>> buscarPaginado(@RequestBody Pageable page){
		Page<TipoEnderecoDTO> pageTipoEnderecoDTO = this.service.findByPage(page);
		return ResponseEntity.ok(pageTipoEnderecoDTO);
	}
	
	@PostMapping
	public ResponseEntity<TipoEnderecoDTO> salvar(@RequestBody TipoEnderecoDTO tipoEndereco){
		TipoEnderecoDTO tipoEnderecoDTO = this.service.save(tipoEndereco);
		return ResponseEntity.ok(tipoEnderecoDTO);
	}
	
	@PutMapping
	public ResponseEntity<TipoEnderecoDTO> atualizar(@RequestBody TipoEnderecoDTO tipoEndereco){
		TipoEnderecoDTO tipoEnderecoDTO = this.service.save(tipoEndereco);
		return ResponseEntity.ok(tipoEnderecoDTO);
	}

}
