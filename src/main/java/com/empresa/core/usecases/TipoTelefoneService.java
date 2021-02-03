package com.empresa.core.usecases;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.empresa.core.model.TipoTelefoneDTO;

@Service
public interface TipoTelefoneService {
	
	public Optional<TipoTelefoneDTO> findById(Long id);
	
	public List<TipoTelefoneDTO> findAll();
	
	public Page<TipoTelefoneDTO> findByPage(Pageable pageable);
	
	public TipoTelefoneDTO save(TipoTelefoneDTO tipoTelefoneDTO);
	
	public void delete(TipoTelefoneDTO tipoTelefoneDTO);
}
