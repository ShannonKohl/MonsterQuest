package com.talkingjack.monsterquest.MonsterQuest;

import java.util.List;

import reactor.core.publisher.Flux;

public interface MonsterRepository {
	public Flux<List<Player>> getPlayers();
}
