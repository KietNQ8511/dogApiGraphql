package com.udacity.jwdnd.c1.resolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udacity.jwdnd.c1.entity.Dog;
import com.udacity.jwdnd.c1.exception.DogNotFoundException;
import com.udacity.jwdnd.c1.repository.DogRepository;

@Component
public class Query implements GraphQLQueryResolver {
	
	@Autowired
	private DogRepository dogRepository;
	
	public Iterable<Dog> findAllDogs() {
		return dogRepository.findAll();
	}
	
	public Dog findDogById(Long id) {
		Optional<Dog> optionalDog = dogRepository.findById(id);
		if(optionalDog.isPresent()) {
			return optionalDog.get();
		} else {
			throw new DogNotFoundException("Dog not found ", id);
		}
	}
}
