//package com.udacity.jwdnd.c1.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.stereotype.Service;
//
//import com.udacity.jwdnd.c1.entity.Dog;
//import com.udacity.jwdnd.c1.exception.DogNotFoundException;
//import com.udacity.jwdnd.c1.repository.DogRepository;
//
//@Service
//public class DogServiceImpl implements DogService {
//	DogRepository dogRepository;
//	
//	public DogServiceImpl(DogRepository dogRepository) {
//		this.dogRepository = dogRepository;
//	}
//
//	@Override
//	public List<Dog> retrieveDogs() {
//		return (List<Dog>) dogRepository.findAll();
//	}
//
//	@Override
//	public List<String> retrieveDogBreed() {
//		return (List<String>) dogRepository.findAllBreed();
//	}
//
//	@Override
//	public String retrieveDogBreedById(Long id) {
//		Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
//		String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
//		return breed;
//	}
//	
////	@Override
////	public String retrieveDogBreedById(Long id) {
////		return (String) dogRepository.findBreedById(id);
////	}
//
//	@Override
//	public List<String> retrieveDogNames() {
//		return (List<String>) dogRepository.findAllName();
//	}
//	
//}
