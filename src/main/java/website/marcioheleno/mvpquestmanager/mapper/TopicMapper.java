package website.marcioheleno.mvpquestmanager.mapper;

import org.apache.ibatis.annotations.Mapper;
import website.marcioheleno.mvpquestmanager.model.entity.Topic;

import java.util.List;

@Mapper
public interface TopicMapper {

    List getTopicList();
    Topic getTopicInfo(int topicNo);
    int addTopicInfo(Topic topic);
    int setTopicInfo(Topic topic);
    int deleteTopicInfo(int topic_no);
}
