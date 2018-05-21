package com.example.mongodbreactivestockquoteservice.repository;

import com.example.mongodbreactivestockquoteservice.domain.Quote;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface QuoteRepository extends ReactiveMongoRepository<Quote, String> {
}
