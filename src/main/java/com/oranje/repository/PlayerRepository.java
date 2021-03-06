package com.oranje.repository;

import com.oranje.domain.Player;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Player entity.
 */
public interface PlayerRepository extends MongoRepository<Player,String> {

}
