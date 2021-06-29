package io.spring.course.app.course_api_app.controllers;

import io.spring.course.app.course_api_app.entities.Topic;
import io.spring.course.app.course_api_app.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping({"/topics"})
    public List<Topic> getAllTopics () {
        return topicService.getAllTopics();
    }

    //get idividual topic
    @GetMapping({"/topics/{id}"})
    public Optional<Topic> getTopic(@PathVariable  String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
