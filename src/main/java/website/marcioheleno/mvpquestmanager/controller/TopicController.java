package website.marcioheleno.mvpquestmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import website.marcioheleno.mvpquestmanager.service.TopicService;
import website.marcioheleno.mvpquestmanager.model.entity.Topic;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/topics")
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping(value="", method = RequestMethod.GET)
    public ResponseEntity getTopicList(){
        HashMap result = new HashMap();

        result.put("data", topicService.getTopicList());
        return new ResponseEntity<>(result , HttpStatus.OK);
    }

    @RequestMapping(value="/{topicNo}", method=RequestMethod.GET)
    public ResponseEntity getTopicInfo(
            @PathVariable int topicNo
    ) {
        HashMap result = new HashMap();

        result.put("data", topicService.getTopicInfo(topicNo));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

        @RequestMapping(value="", method=RequestMethod.POST)
    public ResponseEntity addTopicInfo(
            @RequestBody Topic topic
    ){
        HashMap result = new HashMap();

        topicService.addTopicInfo(topic);
        result.put("resultMessage", "success");

        return new ResponseEntity<>(result , HttpStatus.OK);
    }

    @RequestMapping(value="{topicNo}", method=RequestMethod.PUT)
    public ResponseEntity setTopicInfo(
            @PathVariable int topicNo,
            @RequestBody Topic topic
    ){
        HashMap result = new HashMap();

        topic.setTopicNo(topicNo);
        topicService.setTopicInfo(topic);
        result.put("resultMessage", "success");

        return new ResponseEntity<>(result , HttpStatus.OK);
    }

    @RequestMapping(value="{topicNo}", method=RequestMethod.DELETE)
    public ResponseEntity deleteTopicInfo(
            @PathVariable int topicNo
    ){
        HashMap result = new HashMap();

        topicService.deleteTopicInfo(topicNo);
        result.put("resultMessage", "success");

        return new ResponseEntity<>(result , HttpStatus.OK);
    }


}
