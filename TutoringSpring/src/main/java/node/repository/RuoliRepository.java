package node.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import node.entity.RuoloEntity;

@Repository
public interface RuoliRepository extends JpaRepository<RuoloEntity,Long> { 
	
	
}