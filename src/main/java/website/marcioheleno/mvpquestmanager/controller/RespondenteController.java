package website.marcioheleno.mvpquestmanager.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import website.marcioheleno.mvpquestmanager.model.entity.Respondente;
import website.marcioheleno.mvpquestmanager.service.RespondenteService;

import java.util.HashMap;

@Slf4j
@RestController
@RequestMapping(value = "/respondentes")
public class RespondenteController {

    @Autowired
    RespondenteService respondenteService;

    // ../respondente => Method Get
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity getRespondentesListController () {
        HashMap listCorrespondente = new HashMap();

        listCorrespondente.put("data", respondenteService.getRespondenteServiceList());
        return new ResponseEntity<>(listCorrespondente, HttpStatus.OK);
    }

    // ../respondente/id => Method Get
    @RequestMapping(value="/{cdNumeroRegistro}", method=RequestMethod.GET)
    public ResponseEntity getRespondenteIdController(@PathVariable int cdNumeroRegistro) {
        HashMap resultCorrespondente = new HashMap();
        log.info("Controller...");
        resultCorrespondente.put("data", respondenteService.getRespondenteServiceId(cdNumeroRegistro));
        return new ResponseEntity<>(resultCorrespondente, HttpStatus.OK);
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public ResponseEntity addRespondenteController(@RequestBody Respondente respondente){
        HashMap resultCorrespondente = new HashMap();

        respondenteService.addRespondenteService(respondente);
        resultCorrespondente.put("resultMessage", "success");

        return new ResponseEntity<>(resultCorrespondente , HttpStatus.OK);
    }


    @RequestMapping(value="{cdNumeroRegistro}", method=RequestMethod.PUT)
    public ResponseEntity setTopicInfo(@PathVariable int cdNumeroRegistro, @RequestBody Respondente respondente){
        HashMap result = new HashMap();

        respondente.setCdNumeroRegistro(cdNumeroRegistro);
        respondenteService.setRespondenteUpdateService(respondente);
        result.put("resultMessage", "success");

        return new ResponseEntity<>(result , HttpStatus.OK);
    }

    @RequestMapping(value="{cdNumeroRegistro}", method=RequestMethod.DELETE)
    public ResponseEntity deleteRepresentanteController(@PathVariable int cdNumeroRegistro){
        HashMap result = new HashMap();

        respondenteService.deleteRepresentanteService(cdNumeroRegistro);
        result.put("resultMessage", "success");

        return new ResponseEntity<>(result , HttpStatus.OK);
    }

}
