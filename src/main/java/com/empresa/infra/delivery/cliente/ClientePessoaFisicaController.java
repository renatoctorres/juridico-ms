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

import com.empresa.core.model.cliente.ClientePessoaFisicaDTO;
import com.empresa.core.usecases.cliente.ClientePessoaFisicaService;

@RestController
@RequestMapping("/cliente-pf")
public class ClientePessoaFisicaController {
	
	@Autowired
	ClientePessoaFisicaService service;
		
	@GetMapping
	public ResponseEntity<List<ClientePessoaFisicaDTO>> buscarTodos(){
		List<ClientePessoaFisicaDTO> lista = this.service.findAll();
		return ResponseEntity.ok(lista);
			
	}
		
	@GetMapping("/page")
	public ResponseEntity<Page<ClientePessoaFisicaDTO>> buscarPaginado(@RequestBody Pageable page){
		Page<ClientePessoaFisicaDTO> pageClientePessoaFisicaDTO = this.service.findByPage(page);
		return ResponseEntity.ok(pageClientePessoaFisicaDTO);
			
	}
	
	@PostMapping
	public ResponseEntity<ClientePessoaFisicaDTO> salvar(@RequestBody ClientePessoaFisicaDTO clientePessoaFisica){
		ClientePessoaFisicaDTO clientePessoaFisicaDTO = this.service.save(clientePessoaFisica);
		return ResponseEntity.ok(clientePessoaFisicaDTO);
			
	}
	
	@PutMapping
	public ResponseEntity<ClientePessoaFisicaDTO> atualizar(@RequestBody ClientePessoaFisicaDTO clientePessoaFisica){
		ClientePessoaFisicaDTO clientePessoaFisicaDTO = this.service.save(clientePessoaFisica);
		return ResponseEntity.ok(clientePessoaFisicaDTO);
			
	}

}
