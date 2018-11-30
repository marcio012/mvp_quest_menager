package website.marcioheleno.mvpquestmanager.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import website.marcioheleno.mvpquestmanager.service.RespondenteService;

import java.util.HashMap;

@Slf4j
@RestController
@RequestMapping(value = "/respondente")
public class RespondenteController {

    @Autowired
    RespondenteService respondenteService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity getRespondentesListController () {
        HashMap listCorrespondente = new HashMap();

        listCorrespondente.put("data", respondenteService.getRespondenteServiceList());
        return new ResponseEntity<>(listCorrespondente, HttpStatus.OK);
    }

    @RequestMapping(value="/{cdNumeroRegistro}", method=RequestMethod.GET)
    public ResponseEntity getRespondenteIdController(@PathVariable int cdNumeroRegistro) {
        HashMap resultCorrespondente = new HashMap();
        log.info("Controller...");
        resultCorrespondente.put("data", respondenteService.getRespondenteServiceId(cdNumeroRegistro));
        return new ResponseEntity<>(resultCorrespondente, HttpStatus.OK);
    }

}
