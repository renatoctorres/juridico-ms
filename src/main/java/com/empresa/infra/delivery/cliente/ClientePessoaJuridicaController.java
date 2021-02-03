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

import com.empresa.core.model.cliente.ClientePessoaJuridicaDTO;
import com.empresa.core.usecases.cliente.ClientePessoaJuridicaService;

@RestController
@RequestMapping("/cliente-pj")
public class ClientePessoaJuridicaController {
	
	@Autowired
	ClientePessoaJuridicaService service;
		
	@GetMapping
	public ResponseEntity<List<ClientePessoaJuridicaDTO>> buscarTodos(){
		List<ClientePessoaJuridicaDTO> lista = this.service.findAll();
		return ResponseEntity.ok(lista);
			
	}
		
	@GetMapping("/page")
	public ResponseEntity<Page<ClientePessoaJuridicaDTO>> buscarPaginado(@RequestBody Pageable page){
		Page<ClientePessoaJuridicaDTO> pageClientePessoaJuridicaDTO = this.service.findByPage(page);
		return ResponseEntity.ok(pageClientePessoaJuridicaDTO);
			
	}
	
	@PostMapping
	public ResponseEntity<ClientePessoaJuridicaDTO> salvar(@RequestBody ClientePessoaJuridicaDTO clientePessoaJuridica){
		ClientePessoaJuridicaDTO clientePessoaJuridicaDTO = this.service.save(clientePessoaJuridica);
		return ResponseEntity.ok(clientePessoaJuridicaDTO);
			
	}
	
	@PutMapping
	public ResponseEntity<ClientePessoaJuridicaDTO> atualizar(@RequestBody ClientePessoaJuridicaDTO clientePessoaJuridica){
		ClientePessoaJuridicaDTO clientePessoaJuridicaDTO = this.service.save(clientePessoaJuridica);
		return ResponseEntity.ok(clientePessoaJuridicaDTO);
			
	}

}
