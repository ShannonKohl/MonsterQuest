package com.talkingjack.monsterquest.MonsterQuest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;

@Configuration
public class MonsterWebServiceConfig {

	
	@Bean RouterFunction<?> routes( MonsterRepository monsterRepository ){
		return nest( path( "/monsterquest/player"), 
					route( RequestPredicates.GET( "/{id}"), request -> ok().body( monsterRepository.findById( request.pathVariable( "id")), Player.class))
				);
	}
}
