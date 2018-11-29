package website.marcioheleno.mvpquestmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import website.marcioheleno.mvpquestmanager.mapper.TopicMapper;
import website.marcioheleno.mvpquestmanager.model.entity.Topic;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicMapper topicMapper;


    public List getTopicList() {
        return topicMapper.getTopicList();
    }

    public Topic getTopicInfo(int topicNo) {

        Topic topic = new Topic();
        System.out.println(topic.getTopicNo());

        return topicMapper.getTopicInfo(topicNo);
    }

    public int addTopicInfo(Topic topic) {
        return topicMapper.addTopicInfo(topic);
    }

    public int setTopicInfo(Topic topic){
        return topicMapper.setTopicInfo(topic);
    };

    public int deleteTopicInfo(int topicNo) {
        return topicMapper.deleteTopicInfo(topicNo);
    }
}
