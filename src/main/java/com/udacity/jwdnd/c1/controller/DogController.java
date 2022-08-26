//package com.udacity.jwdnd.c1.controller;
//
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.udacity.jwdnd.c1.entity.Dog;
//import com.udacity.jwdnd.c1.service.DogService;
//
//@RestController
//public class DogController {
//	private DogService dogService;
//
//	public DogController(DogService dogService) {
//		// TODO Auto-generated constructor stub
//		this.dogService = dogService;
//	}
//	
//	@GetMapping("/dogs")
//	public ResponseEntity<List<Dog>> getAllDogs() {
//		List<Dog> list = dogService.retrieveDogs();
//		return new ResponseEntity<List<Dog>>(list, HttpStatus.OK);
//	}
//	
//	@GetMapping("/dogs/breed")
//	public ResponseEntity<List<String>> getDogBreeds() {
//		List<String> list = dogService.retrieveDogBreed();
//		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
//	}
//	
//	@GetMapping("/{id}/breed")
//	public ResponseEntity<String> getBreedById(@PathVariable Long id) {
//		String breed = dogService.retrieveDogBreedById(id);
//		return new ResponseEntity<String>(breed, HttpStatus.OK);
//	}
//	
//	@GetMapping("/dogs/name")
//	public ResponseEntity<List<String>> getDogNames() {
//		List<String> list = dogService.retrieveDogNames();
//		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
//	}
//}