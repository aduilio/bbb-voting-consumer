package com.aduilio.votacaobbb.service;

import java.util.Date;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.aduilio.votacaobbb.model.Vote;
import com.aduilio.votacaobbb.repository.VoteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegisterVoteService {

	private final VoteRepository repository;

	@KafkaListener(topics = "voting", groupId = "VotingMicroservice")
	private void execute(ConsumerRecord<String, String> register) {
		Vote vote = Vote.builder()
				.date(new Date())
				.participantId(register.value())
				.build();

		repository.save(vote);
	}
}
