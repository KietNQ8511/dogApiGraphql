package com.udacity.jwdnd.c1.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class BreedNotFoundException extends RuntimeException implements GraphQLError {

	private static final long serialVersionUID = -4433220936466249408L;

	private Map<String, Object> extensions = new HashMap<>();
	
	public BreedNotFoundException(String message, String invalidBreedId) {
		super(message);
		extensions.put("invalid breed id", invalidBreedId);
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
