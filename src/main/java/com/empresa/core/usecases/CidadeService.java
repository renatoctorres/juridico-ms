package com.empresa.core.usecases;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.empresa.core.model.CidadeDTO;

@Service
public interface CidadeService {
	
	public Optional<CidadeDTO> findById(Long id);
	
	public List<CidadeDTO> findAll();
	
	public Page<CidadeDTO> findByPage(Pageable pageable);
	
	public CidadeDTO save(CidadeDTO cidade);
	
	public void delete(CidadeDTO cidade);
}
