package com.franciscofarias.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franciscofarias.workshopmongo.domain.Post;
import com.franciscofarias.workshopmongo.repository.PostRepository;
import com.franciscofarias.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
		Post post= repo.findById(id).get();
		if (post==null) {
			throw new ObjectNotFoundException("Objeto não encontrado.");
		}
		return post;
	}	

}