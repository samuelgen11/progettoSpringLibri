package node.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import node.entity.LibroEntity;
import node.model.AutoreDto;
import node.model.LibroDto;
import node.repository.LibroRepository;
@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	public LibroRepository libroRepository;
	
	public List<LibroDto> getAllLibri() {
		
		// JEE STYLE CON HIBERNATE E NAMEDQUERY
		//em.createNamedQuery(Padrone.NAMED_QUERY_ALL, Padrone.class)
		//.getResultList();
		
		// SPRING REPOSITORY
		List<LibroEntity> listLibroEntity = libroRepository.findAll();
		
		return listLibroEntity.stream()
				.map(entity -> {
					LibroDto dto = new LibroDto();
					dto.setId_libro(entity.getId_libro());
					dto.setTitolo(entity.getTitolo());
					dto.setNumeroPagine(entity.getNumeroPagine());
					AutoreDto autoreDto = new AutoreDto(entity.getId());
					dto.setId_autore(autoreDto.getIdAutore());
					return dto;
				})
				.collect(Collectors.toList());
	}
	
	public void saveLibro(LibroEntity libro) {
		libroRepository.save(libro);
	}
	
}
