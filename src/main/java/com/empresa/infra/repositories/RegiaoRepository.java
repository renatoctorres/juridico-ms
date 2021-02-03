package com.empresa.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.empresa.infra.repositories.entity.Regiao;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long>{

}
