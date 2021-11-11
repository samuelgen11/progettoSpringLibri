package node.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import node.entity.RuoloEntity;
import node.model.RuoloDto;
import node.repository.RuoliRepository;

@Service
public class RuoloServiceImpl implements RuoloService{
	
	@Autowired
	public RuoliRepository ruoliRepository;
	
	public List<RuoloDto> getAllRuoli() {
		
		// JEE STYLE CON HIBERNATE E NAMEDQUERY
		//em.createNamedQuery(Padrone.NAMED_QUERY_ALL, Padrone.class)
		//.getResultList();
		
		// SPRING REPOSITORY
		List<RuoloEntity> listRuoloEntity = ruoliRepository.findAll();
		
		return listRuoloEntity.stream()
				.map(entity -> {
					RuoloDto dto = new RuoloDto();
					dto.setDescrizioneRuolo(entity.getDescrizioneRuolo());
					dto.setId(entity.getId());
					return dto;
				})
				.collect(Collectors.toList());
	}
	
	public void saveRuolo(RuoloEntity ruolo) {
		ruoliRepository.save(ruolo);
	}
	
}
