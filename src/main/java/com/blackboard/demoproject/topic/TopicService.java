package com.blackboard.demoproject.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sdivakarla on 24/01/19.
 */

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic("cs101", "Computer science fundamentals"),
            new Topic("alg101", "Algorithms Fundamentals"),
            new Topic("mat101", " Mathematics Fundamentals")));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopicById(String id){
        return topics.stream().filter(topic -> id.equals(topic.getId())).findAny().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for(int i=0; i <topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, t);
            }
        }
    }

}
