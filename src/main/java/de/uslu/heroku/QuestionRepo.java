package de.uslu.heroku;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends MongoRepository<Question, String> {

    List<Question> findByRating(String rating);

}
