package com.talkingjack.monsterquest.MonsterQuest;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerHandler {
	@Autowired private MonsterRepository repo;
	
	//demo used final repo
//	public PlayerHandler( MonsterRepository newRepo ) { this.repo = newRepo; }
	
	public Mono<ServerResponse> listPlayers( ServerRequest request ){
		System.out.println( "listPlayers");
		Flux<Player> players = repo.findAll();
		return ServerResponse.ok().contentType( APPLICATION_JSON ).body( players, Player.class );
	}
}
