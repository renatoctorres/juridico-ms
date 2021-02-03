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

import com.empresa.core.model.TipoTelefoneDTO;
import com.empresa.core.usecases.TipoTelefoneService;

@RestController
@RequestMapping("/tipo-telefone")
public class TipoTelefoneController {
	
	@Autowired
	TipoTelefoneService service;
	
	@GetMapping
	public ResponseEntity<List<TipoTelefoneDTO>> buscarTodos(){
		List<TipoTelefoneDTO> lista = this.service.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/page")
	public ResponseEntity<Page<TipoTelefoneDTO>> buscarPaginado(@RequestBody Pageable page){
		Page<TipoTelefoneDTO> pageTipoTelefoneDTO = this.service.findByPage(page);
		return ResponseEntity.ok(pageTipoTelefoneDTO);
	}
	
	@PostMapping
	public ResponseEntity<TipoTelefoneDTO> salvar(@RequestBody TipoTelefoneDTO tipoTelefone){
		TipoTelefoneDTO tipoTelefoneDTO = this.service.save(tipoTelefone);
		return ResponseEntity.ok(tipoTelefoneDTO);
	}
	
	@PutMapping
	public ResponseEntity<TipoTelefoneDTO> atualizar(@RequestBody TipoTelefoneDTO tipoTelefone){
		TipoTelefoneDTO tipoTelefoneDTO = this.service.save(tipoTelefone);
		return ResponseEntity.ok(tipoTelefoneDTO);
	}

}
