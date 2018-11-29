package website.marcioheleno.mvpquestmanager.mapper;

import org.apache.ibatis.annotations.Mapper;
import website.marcioheleno.mvpquestmanager.model.entity.Topic;

import java.util.List;

@Mapper
public interface TopicMapper {

    public List getTopicList();
    public Topic getTopicInfo(int topicNo);
    public int addTopicInfo(Topic topic);
    public int setTopicInfo(Topic topic);
    public int deleteTopicInfo(int topic_no);
}
