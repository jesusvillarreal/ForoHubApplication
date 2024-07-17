package com.proyecto.ForoHubApplication.repository;


import com.proyecto.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
