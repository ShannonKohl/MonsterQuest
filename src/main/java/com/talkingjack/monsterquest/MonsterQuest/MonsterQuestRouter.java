package com.talkingjack.monsterquest.MonsterQuest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

//@RestController
//or configuration instead?

/**
 * Now done in MonsterWebServiceConfig
 * Notes: router functions are evaluated in order, so specific => general
 * @author shannonkohl
 *
 */
public class MonsterQuestRouter {
//	@Autowired private PlayerHandler playerHandler;
//	
//	public RouterFunction<ServerResponse> route( ServerRequest request ){
//		RouterFunction<ServerResponse> playersRoute = RouterFunctions.route(
//				RequestPredicates.path( "/players"), playerHandler::listPlayers);
//		return playersRoute;
//	}
}
