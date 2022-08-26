package com.udacity.jwdnd.c1.repository;

import org.springframework.data.repository.CrudRepository;

import com.udacity.jwdnd.c1.entity.Dog;

//@Repository
public interface DogRepository extends CrudRepository<Dog, Long>{
//	@Query("Select d.id, d.breed from Dog d where d.id =:id")
//	String findBreedById(Long id);
//	
//	@Query("Select d.id, d.breed from Dog d")
//	List<String> findAllBreed();
//	
//	@Query("Select d.id, d.name from Dog d")
//	List<String> findAllName();
}
