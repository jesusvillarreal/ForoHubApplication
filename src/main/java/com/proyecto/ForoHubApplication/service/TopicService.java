package com.proyecto.ForoHubApplication.service;

import com.proyecto.dto.TopicDTO;
import com.proyecto.model.Topic;
import com.proyecto.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic createTopic(TopicDTO topicDTO) {
        Topic topic = new Topic();
        topic.setTitle(topicDTO.getTitle());
        topic.setMessage(topicDTO.getMessage());
        topic.setStatus(topicDTO.getStatus());
        topic.setAuthor(topicDTO.getAuthor());
        topic.setCourse(topicDTO.getCourse());
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Optional<Topic> getTopicById(Long id) {
        return topicRepository.findById(id);
    }

    public Topic updateTopic(Long id, TopicDTO topicDTO) {
        Optional<Topic> existingTopic = topicRepository.findById(id);
        if (existingTopic.isPresent()) {
            Topic topic = existingTopic.get();
            topic.setTitle(topicDTO.getTitle());
            topic.setMessage(topicDTO.getMessage());
            topic.setStatus(topicDTO.getStatus());
            topic.setAuthor(topicDTO.getAuthor());
            topic.setCourse(topicDTO.getCourse());
            return topicRepository.save(topic);
        }
        return null;
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}
