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

    // get listar
    public List getRespondenteServiceList() {
        return respondenteMapper.getRespondenteListMapper();
    }

    public Respondente getRespondenteServiceId(int cdNumeroRegistro) {
        return respondenteMapper.getRespondenteIdMapper(cdNumeroRegistro);
    }
}
