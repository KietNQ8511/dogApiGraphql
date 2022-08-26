package com.udacity.jwdnd.c1.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class DogNotFoundException extends RuntimeException implements GraphQLError{

	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> extensions = new HashMap<>();
	
	public DogNotFoundException() {
	}
	
	public DogNotFoundException(String message) {
		super(message);
	}

	public DogNotFoundException(String message, Long invalidDogId) {
		super(message);
		extensions.put("invalid dog id", invalidDogId);
	}

	@Override
	public List<SourceLocation> getLocations() {
		return null;
	}
	
	private Map<String, Object> getExtentions() {
		return extensions;
	}
	
	@Override
	public ErrorClassification getErrorType() {
		return ErrorType.DataFetchingException;
	}
}
