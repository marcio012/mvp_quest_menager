package website.marcioheleno.mvpquestmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import website.marcioheleno.mvpquestmanager.mapper.RespondenteMapper;
import website.marcioheleno.mvpquestmanager.model.entity.Respondente;
import website.marcioheleno.mvpquestmanager.model.entity.Topic;

import java.util.List;

@Service
public class RespondenteService {

    @Autowired
    RespondenteMapper respondenteMapper;

    public List getRespondenteList() {
        return respondenteMapper.getRespondenteList();
    }

    public Respondente getRespondentId(int id) {
        Respondente respondente = new Respondente();
        System.out.println(respondente);
    }

    public Topic getTopicInfo(int topicNo) {

        Topic topic = new Topic();
        System.out.println(topic.getTopicNo());

        return topicMapper.getTopicInfo(topicNo);
    }


}
