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
import com.empresa.infra.configuration.converter.TipoTelefoneConverter;
import com.empresa.infra.repositories.entity.TipoTelefone;

@RestController
@RequestMapping("/tipo-telefone")
public class TipoTelefoneController {
	
	@Autowired
	TipoTelefoneService service;

	TipoTelefoneConverter converter = new TipoTelefoneConverter();
	
	@GetMapping
	public ResponseEntity<List<TipoTelefoneDTO>> buscarTodos(){
		List<TipoTelefone> lista = this.service.findAll();
		return ResponseEntity.ok(this.converter.createFromEntities(lista));
	}
	
	@GetMapping("/page")
	public ResponseEntity<Page<TipoTelefoneDTO>> buscarPaginado(@RequestBody Pageable page){
		Page<TipoTelefone> pageTipoTelefone = this.service.findByPage(page);
		return ResponseEntity.ok(pageTipoTelefone.map(this::convertFromEntity));
	}
	
	@PostMapping
	public ResponseEntity<TipoTelefoneDTO> salvar(@RequestBody TipoTelefoneDTO tipoTelefoneDTO){
		TipoTelefone tipoTelefone = this.service.save(this.converter.convertFromDto(tipoTelefoneDTO));
		return ResponseEntity.ok(convertFromEntity(tipoTelefone));
	}
	
	@PutMapping
	public ResponseEntity<TipoTelefoneDTO> atualizar(@RequestBody TipoTelefoneDTO tipoTelefoneDTO){
		TipoTelefone tipoTelefone = this.service.save(this.converter.convertFromDto(tipoTelefoneDTO));
		return ResponseEntity.ok(convertFromEntity(tipoTelefone));
	}
	

	private TipoTelefoneDTO convertFromEntity(TipoTelefone tipoTelefone) {
		return this.converter.convertFromEntity(tipoTelefone);
	}


}
