package de.uslu.heroku;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepo questionRepo;


    public Question createNewQuestion(Question question) {
        return questionRepo.save(question);
    }

    public Optional<Question> findById(String id) {
        return questionRepo.findById(id);
    }

    public List<Question> findByRating(String rating) {
        return questionRepo.findByRating(rating);
    }
}
