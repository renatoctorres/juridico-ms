package com.empresa.infra.repositories.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.empresa.infra.repositories.entity.cliente.ClientePessoaJuridica;

@Repository
public interface ClientePessoaJuridicaRepository extends JpaRepository<ClientePessoaJuridica, Long>{

}
