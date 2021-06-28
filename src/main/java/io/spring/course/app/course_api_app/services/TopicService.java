package io.spring.course.app.course_api_app.services;

import io.spring.course.app.course_api_app.entities.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("java", "Java Core", "Java Core Learning description"),
            new Topic("javascript", "JavaScript", "JavaScript description"),
            new Topic("spring", "Spring Framework", "Spring Framework description")
    ));

    public List<Topic> getAllTopics() {

         return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(T -> T.getId().equals(id)).findFirst().get();
    }


    public void addTopic(Topic topic) {
        //Arrays.asList is immutable, so can't add data, need to set it to new Arraylist
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
                Topic t = topics.get(i);
                if (t.getId().equals(id)) {
                    topics.set(i, topic);
                    return;
                }
        }
    }

    public void deleteTopic(String id) {
        for (Topic topicData: topics) {
             if (topicData.getId().equals(id)) {
                 topics.remove(topicData);
                 return;
             }
        }
        topics.removeIf(T -> T.getId().equals(id));

    }

}
