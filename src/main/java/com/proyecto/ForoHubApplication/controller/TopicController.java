package com.proyecto.ForoHubApplication.controller;

import com.proyecto.dto.TopicDTO;
import com.proyecto.model.Topic;
import com.proyecto.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @PostMapping
    public Topic createTopic(@Valid @RequestBody TopicDTO topicDTO) {
        return topicService.createTopic(topicDTO);
    }

    @GetMapping
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/{id}")
    public Optional<Topic> getTopicById(@PathVariable Long id) {
        return topicService.getTopicById(id);
    }

    @PutMapping("/{id}")
    public Topic updateTopic(@PathVariable Long id, @Valid @RequestBody TopicDTO topicDTO) {
        return topicService.updateTopic(id, topicDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable Long id) {
        topicService.deleteTopic(id);
    }
}
