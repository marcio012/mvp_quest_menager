package website.marcioheleno.mvpquestmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import website.marcioheleno.mvpquestmanager.model.entity.Respondente;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/respondente")
public class RespondenteController {

    @Autowired

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Respondente> getRespondentes () {
        HashMap result = new HashMap();

        result.put("data", re)
    }

    @RequestMapping(value="", method = RequestMethod.GET)
    public ResponseEntity getTopicList(){
        HashMap result = new HashMap();

        result.put("data", topicService.getTopicList());
        return new ResponseEntity<>(result , HttpStatus.OK);
    }

}
