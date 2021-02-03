package com.empresa.infra.delivery.cliente;

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

import com.empresa.core.model.cliente.ClienteTelefoneDTO;
import com.empresa.core.usecases.cliente.ClienteTelefoneService;

@RestController
@RequestMapping("/cliente-telefone")
public class ClienteTelefoneController {
	
	@Autowired
	ClienteTelefoneService service;
		
	@GetMapping
	public ResponseEntity<List<ClienteTelefoneDTO>> buscarTodos(){
		List<ClienteTelefoneDTO> lista = this.service.findAll();
		return ResponseEntity.ok(lista);
			
	}
		
	@GetMapping("/page")
	public ResponseEntity<Page<ClienteTelefoneDTO>> buscarPaginado(@RequestBody Pageable page){
		Page<ClienteTelefoneDTO> pageClienteTelefoneDTO = this.service.findByPage(page);
		return ResponseEntity.ok(pageClienteTelefoneDTO);
			
	}
	
	@PostMapping
	public ResponseEntity<ClienteTelefoneDTO> salvar(@RequestBody ClienteTelefoneDTO clienteTelefone){
		ClienteTelefoneDTO clienteTelefoneDTO = this.service.save(clienteTelefone);
		return ResponseEntity.ok(clienteTelefoneDTO);
			
	}
	
	@PutMapping
	public ResponseEntity<ClienteTelefoneDTO> atualizar(@RequestBody ClienteTelefoneDTO clienteTelefone){
		ClienteTelefoneDTO clienteTelefoneDTO = this.service.save(clienteTelefone);
		return ResponseEntity.ok(clienteTelefoneDTO);
			
	}

}
