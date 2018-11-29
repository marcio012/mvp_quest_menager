package website.marcioheleno.mvpquestmanager.mapper;

import org.apache.ibatis.annotations.Mapper;
import website.marcioheleno.mvpquestmanager.model.entity.Respondente;

import java.util.List;

@Mapper
public interface RespondenteMapper {

    List getRespondenteList();
    Respondente getRespondenteId(int id);
    int addRespondente(Respondente respondente);
    int updateRespondente(Respondente respondente);
    int deleteRespondente(int id);

}
