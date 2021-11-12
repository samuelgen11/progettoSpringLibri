package node.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import node.entity.AutoreEntity;
import node.model.AutoreDto;
import node.repository.AutoreRepository;

@Service
public class AutoreServiceImpl implements AutoreService{
	
	@Autowired
	public AutoreRepository autoreRepository;
	
	public List<AutoreDto> getAllAutori() {
		
		// JEE STYLE CON HIBERNATE E NAMEDQUERY
		//em.createNamedQuery(Padrone.NAMED_QUERY_ALL, Padrone.class)
		//.getResultList();
		
		// SPRING REPOSITORY
		List<AutoreEntity> listAutoreEntity = autoreRepository.findAll();
		
		return listAutoreEntity.stream()
				.map(entity -> {
					AutoreDto dto = new AutoreDto();
					dto.setNome(entity.getNome());
					dto.setCognome(entity.getCognome());
					dto.setEta(entity.getEta());
					dto.setIdAutore(entity.getId());
					return dto;
				})
				.collect(Collectors.toList());
	}
	
	public void saveAutore(AutoreEntity autore) {
		autoreRepository.save(autore);
	}
	
}
