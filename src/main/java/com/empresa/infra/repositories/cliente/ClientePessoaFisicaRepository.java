package com.empresa.infra.repositories.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.empresa.infra.repositories.entity.cliente.ClientePessoaFisica;

@Repository
public interface ClientePessoaFisicaRepository extends JpaRepository<ClientePessoaFisica, Long>{

}
