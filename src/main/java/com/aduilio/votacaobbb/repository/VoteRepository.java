package com.aduilio.votacaobbb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aduilio.votacaobbb.model.Vote;

/**
 * Provides access to the database table Vote.
 */
public interface VoteRepository extends MongoRepository<Vote, String> {

}
