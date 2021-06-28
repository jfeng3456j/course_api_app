package io.spring.course.app.course_api_app.repositories;


import io.spring.course.app.course_api_app.entities.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
