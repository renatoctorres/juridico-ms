package com.empresa.infra.repositories.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.empresa.infra.repositories.entity.cliente.ClienteEndereco;

@Repository
public interface ClienteEnderecoRepository extends JpaRepository<ClienteEndereco, Long>{

}
