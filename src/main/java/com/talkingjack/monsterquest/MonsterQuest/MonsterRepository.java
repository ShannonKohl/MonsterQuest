package com.talkingjack.monsterquest.MonsterQuest;

import java.util.List;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

@Repository
public interface MonsterRepository extends ReactiveMongoRepository<Player, String> {
}
