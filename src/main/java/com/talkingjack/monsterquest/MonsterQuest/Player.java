package com.talkingjack.monsterquest.MonsterQuest;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document
public class Player {
	public String firstName;
	public String lastName;
	public String userId;
	public String email;	
}
