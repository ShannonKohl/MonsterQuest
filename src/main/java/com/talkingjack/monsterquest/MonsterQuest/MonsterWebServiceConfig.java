package com.talkingjack.monsterquest.MonsterQuest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.DelegatingWebFluxConfiguration;
import org.springframework.web.reactive.config.EnableWebFlux;

import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class MonsterWebServiceConfig extends DelegatingWebFluxConfiguration {

	@Autowired private PlayerHandler playerHandler;
	
	public RouterFunction<ServerResponse> route( ServerRequest request ){
		RouterFunction<ServerResponse> playersRoute = RouterFunctions.route(
				RequestPredicates.path( "/players"), playerHandler::listPlayers);
		return playersRoute;
	}
}
