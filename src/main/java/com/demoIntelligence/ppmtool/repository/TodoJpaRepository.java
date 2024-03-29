package com.demoIntelligence.ppmtool.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demoIntelligence.ppmtool.model.Todo;


@Repository
public interface TodoJpaRepository extends CrudRepository<Todo, Long> {

	List<Todo> findAllByUsername(String username);

	Todo findByUsernameAndId(String username, long id);

}
