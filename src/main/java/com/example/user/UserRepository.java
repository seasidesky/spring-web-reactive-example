package com.example.user;

import com.example.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {

	Mono<User> findById(long id);
	Flux<User> findAll();
	Mono<Void> save(User user);
	
}
