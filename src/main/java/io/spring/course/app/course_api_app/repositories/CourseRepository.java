package io.spring.course.app.course_api_app.repositories;

import io.spring.course.app.course_api_app.entities.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository  extends CrudRepository<Course, String> {

    public List<Course> findByTopicId (String topicId);
}
