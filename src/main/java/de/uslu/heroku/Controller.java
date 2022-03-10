package de.uslu.heroku;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {

    private final QuestionService questionService;

    @PostMapping
    public Question createQuestion(@RequestBody Question question){
        return questionService.createNewQuestion(question);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> findQuestionById(@PathVariable String id) {
        return ResponseEntity.of(questionService.findById(id));
    }

    @GetMapping
    public List<Question> findByRating(@RequestParam String rating) {
        return questionService.findByRating(rating);
    }

}
