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

import com.empresa.core.model.cliente.ClienteDTO;
import com.empresa.core.usecases.cliente.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService service;
	
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> buscarTodos(){
		List<ClienteDTO> lista = this.service.findAll();
		return ResponseEntity.ok(lista);
			
	}
	
	
	@GetMapping("/page")
	public ResponseEntity<Page<ClienteDTO>> buscarPaginado(@RequestBody Pageable page){
		Page<ClienteDTO> pageClienteDTO = this.service.findByPage(page);
		return ResponseEntity.ok(pageClienteDTO);
			
	}
	
	@PostMapping
	public ResponseEntity<ClienteDTO> salvar(@RequestBody ClienteDTO cliente){
		ClienteDTO clienteDTO = this.service.save(cliente);
		return ResponseEntity.ok(clienteDTO);
			
	}
	
	@PutMapping
	public ResponseEntity<ClienteDTO> atualizar(@RequestBody ClienteDTO cliente){
		ClienteDTO clienteDTO = this.service.save(cliente);
		return ResponseEntity.ok(clienteDTO);
			
	}

}
