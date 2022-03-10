package de.uslu.heroku;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HerokuApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        Question question = new Question();
        question.setQuestion("was ist das");
        question.setRating("zu kurz");

        ResponseEntity<Question> postResponse = restTemplate.postForEntity("/api", question, Question.class);
        assertThat(postResponse.getStatusCode()).isEqualTo(HttpStatus.OK);


    }

}
