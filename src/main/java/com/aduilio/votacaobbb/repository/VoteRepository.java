package com.aduilio.votacaobbb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aduilio.votacaobbb.model.Vote;

public interface VoteRepository extends MongoRepository<Vote, String> {

}
