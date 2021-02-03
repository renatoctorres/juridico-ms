package com.empresa.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.empresa.infra.repositories.entity.TipoPessoa;

@Repository
public interface TipoPessoaRepository extends JpaRepository<TipoPessoa, Long>{

}
