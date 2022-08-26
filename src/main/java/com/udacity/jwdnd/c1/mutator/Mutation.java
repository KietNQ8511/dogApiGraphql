package com.udacity.jwdnd.c1.mutator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.udacity.jwdnd.c1.entity.Dog;
import com.udacity.jwdnd.c1.exception.BreedNotFoundException;
import com.udacity.jwdnd.c1.exception.DogNotFoundException;
import com.udacity.jwdnd.c1.repository.DogRepository;

@Component
public class Mutation implements GraphQLMutationResolver{
	@Autowired
	private DogRepository dogRepository;
	
	public boolean deleteDogBreed(String breed) {
		boolean deleted = false;
		Iterable<Dog> allDogs = dogRepository.findAll();
		
		for(Dog d:allDogs) {
			if(d.getBreed().equals(breed)) {
				dogRepository.delete(d);
				deleted = true;
			}
		}
		
		if (!deleted) {
			throw new BreedNotFoundException("Breed not found ", breed);
		}
		
		return deleted;
	}
	
	public Dog updateDogName(String newName, Long id) {
		Optional<Dog> optionalDog = dogRepository.findById(id);
		if (optionalDog.isPresent()) {
			Dog dog = optionalDog.get();
			dog.setName(newName);
			dogRepository.save(dog);
			return dog;
		} else {
			throw new DogNotFoundException("Dog not found ", id);
		}
	}
}
