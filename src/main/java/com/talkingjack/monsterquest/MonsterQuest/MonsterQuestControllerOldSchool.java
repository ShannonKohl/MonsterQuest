package com.talkingjack.monsterquest.MonsterQuest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class MonsterQuestControllerOldSchool {
	
	@Autowired MonsterRepository monsterRepo;
	
	@GetMapping("/monsterquest/players")
	public Flux<List<Player>> getPlayers(){
		return monsterRepo.getPlayers();
	}

}
